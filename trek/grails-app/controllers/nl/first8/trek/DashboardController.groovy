package nl.first8.trek

class DashboardController {
	
	/** Dependency injection for securityService. */
	def securityService

	// TODO3: When going to this method is called... 
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
		
		//TODO4: the method gathered some data, and delivers this as a map to the view...
		["currentPerson" : loggedInPerson, "colleagues" : colleagues]
	}
	
	def theme() {
		// only here to view theme.gsp - our LCARS Bootstrap theme example
	}
}
