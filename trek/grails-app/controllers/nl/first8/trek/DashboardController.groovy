package nl.first8.trek

class DashboardController {
	
	/** Dependency injection for securityService. */
	def securityService

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
		
		["currentPerson" : loggedInPerson, "colleagues" : colleagues]
	}
	
	def theme() {
		// only here to view theme.gsp - our LCARS Bootstrap theme example
	}
}
