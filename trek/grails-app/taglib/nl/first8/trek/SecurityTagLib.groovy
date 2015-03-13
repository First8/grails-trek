package nl.first8.trek

/**
 * Security tags. 
 */
class SecurityTagLib {

	//TODO7: tag libs are an easy way of easily reusing small snippets of html with behavior
	static namespace = 'sec'

	/** Dependency injection for securityService. */
	def securityService

	static defaultEncodeAs = [taglib:'none']

	/**
	 * Renders the user's username if logged in.
	 */
	def username = { attrs ->
		if (securityService.isLoggedIn()) {
			out << securityService.user.userName.encodeAsHTML()
		}
	}
	
	/**
	 * Renders the body if the user is authenticated.
	 */
	def ifLoggedIn = { attrs, body ->
		if (securityService.isLoggedIn()) {
			out << body()
		}
	}
	/**
	 * Renders the body if the user is not authenticated.
	 */
	def ifNotLoggedIn = { attrs, body ->
		if (!securityService.isLoggedIn()) {
			out << body()
		}
	}
	
	/**
	 * Renders link to a action on the UserController for the currently logged in user's page
	 */
	def createLinkToUserPage = { attrs, body ->
		if (securityService.isLoggedIn()) {
			out << g.link(controller: "user", action: attrs.action, id: securityService.user.id) { body() }
		}
	}
}
