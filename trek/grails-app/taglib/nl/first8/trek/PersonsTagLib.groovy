package nl.first8.trek

class PersonsTagLib {
	
	static namespace = "person"
	
	/** Dependency injection for securityService. */
	def securityService
	
    static defaultEncodeAs = [taglib:'none']
    static encodeAsForTags = [intro: [taglib:'html']]
	
	def createLinkToSpaceship(Spaceship spaceship) {
		g.link(controller: "spaceship", action: "show", id: spaceship.id) { spaceship.encodeAsHTML() }
	}
	
	def personName = {
		if (securityService.isLoggedIn()) {
			out << securityService.user.person.name.encodeAsHTML()
		}
	}
	
	/**
	 * Displays the biography of given person. 
	 * Outputs the first line of the biography in a separate lead-paragraph, apart from the other lines.
	 * 
	 * e.g. &lt;person:bio person="${person}" /&gt;
	 * 
	 * @emptyTag
	 * 
	 * @attr person REQUIRED The person
	 * 
	 */
	def bio = { attrs ->
		if (!attrs.person) {
			throwTagError('Tag ["bio"] missing required attribute ["person"]')
		}
		
		def p = attrs.remove('person')
		if (p.bio) {

			// split the bio by period			
			def lines = p.bio.split('\\.') // split regex for period (".")
			
			// find me the lead line
			def lead = lines ? lines.head() + "." : p.bio
			
			// try to join the remainder again
			def rest = lines ? lines.tail().join(".") : ""
			
			out << "<p class=\"lead\">"
			out << lead
			out << "</p>"
			
			if (rest) {
				rest += "."
				out << "<p>"
				out << rest.trim()
				out << "</p>"
			}
		}
	}
		
	def mostRecentAssignment = { attrs ->
		if (!attrs.person) {
			throwTagError('Tag ["mostRecentAssignment"] missing required attribute ["person"]')
		}
		
		def p = attrs.remove('person')
		def sortedAssignments = p.assignments.sort { it.yearFrom }
		if (sortedAssignments) {
			def a = sortedAssignments.last()
			out << a.occupation.encodeAsHTML()
			out << " on the "
			out << createLinkToSpaceship(a.spaceship)
			out << " ($a.yearFrom-" + (a.yearTo ?: "")+ ")"
		} else {
			out << "-"
		}
		
	}
	
	def assignments = { attrs ->
		if (!attrs.person) {
			throwTagError('Tag ["otherAssignments"] missing required attribute ["person"]')
		}
		
		def p = attrs.remove('person')
		List assignments = p.assignments.sort { it.yearFrom }
		out << "<ul class=\"list-unstyled\">"
		assignments.each { a ->
			out << "<li><i class=\"glyphicon glyphicon-chevron-right\"></i> " + g.link(controller: "assignment", action: "show", id: a.id) { a.encodeAsHTML() } + "</li>"
		}
		out << "</ul>"
	}
}
