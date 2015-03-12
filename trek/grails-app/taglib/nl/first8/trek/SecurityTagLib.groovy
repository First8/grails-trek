package nl.first8.trek

/**
 * Security tags. 
 */
class SecurityTagLib {

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
}
