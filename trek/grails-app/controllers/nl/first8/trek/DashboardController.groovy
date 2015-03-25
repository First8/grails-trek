package nl.first8.trek

class DashboardController {
	
	/** Dependency injection for securityService. */
	def securityService

	/* TODO03: So, going to /trek/ means going to this controller method.
	 *         "Controllers handle the code that links a user to the system. 
	 *          It receives request or events from the user, prepare data and
	 *          invoke proper business logic, and then return the view that 
	 *          represents the result of user actions."
	 */ 
    def index() {
		
		def loggedInPerson
		List<Person> colleagues = []
		if (securityService.isLoggedIn()) {
			
			// see if we are logged in
			loggedInPerson = securityService.loadUser().person
			
			// find all colleagues (excl. yourself) for same organization
			colleagues = Person.findAll {
				id != loggedInPerson.id && worksFor == loggedInPerson.worksFor
			}
		}
		
		//TODO04: This controller method gathered some data, and delivers this as a map to the view...
		["currentPerson" : loggedInPerson, "colleagues" : colleagues]
	}
	
	def theme() {
		// only here to view theme.gsp - our LCARS Bootstrap theme example
	}
}
