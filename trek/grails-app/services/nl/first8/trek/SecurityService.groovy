package nl.first8.trek

import javax.servlet.http.HttpSession
import nl.first8.trek.security.User
import org.springframework.web.context.request.RequestContextHolder
import grails.transaction.Transactional

/**
 * Security related things.
 */
@Transactional
class SecurityService {

	private HttpSession getSession() {
		return RequestContextHolder.currentRequestAttributes().getSession()
	}

	/**
	 * Log user in.
	 */
	void login(User user) {
		assert user
		// store the user on the session
		getSession().user = user
		log.info "Logged in as " + user
	}

	/**
	 * Log current user out.	
	 */
	void logout() {
		log.info "Logging out " + user
		// clear the user
		getSession().user = null
	}

	/**
	 * Gets the current logged in user, if any.
	 */
	User getUser() {
		getSession().user
	}
	
	/**
	 * Get current logged in user, when you want to use User in a query 
	 * e.g. prevents org.hibernate.LazyInitializationException.
	 */
	User loadUser() {
		if (!isLoggedIn()) {
			return null
		}
		
		User.get(getUser().id)
	}

	/**
	 * Quick check to see if the current user is logged in.
	 * 
	 * @return <code>true</code> if the authenticated and not anonymous
	 */
	boolean isLoggedIn() {
		getUser()
	}
}
