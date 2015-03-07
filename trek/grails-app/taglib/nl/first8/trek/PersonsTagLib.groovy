package nl.first8.trek

class PersonsTagLib {
	
	static namespace = "person"
	
    static defaultEncodeAs = [taglib:'none']
    static encodeAsForTags = [intro: [taglib:'html']]
	
	def createLinkToSpaceship(Spaceship spaceship) {
		g.link(controller: "spaceship", action: "show", id: spaceship.id) { spaceship.encodeAsHTML() }
	}
	
	def intro = { attrs ->
		
		out << "Jean-Luc Picard was a celebrated Starfleet officer, archaeologist and diplomat who served during "
		out << "the latter two thirds of the 24th century. The highlights of his career were centered around assignments as "
		out << "commanding officer of "
		out << "the Federation starships: USS Stargazer, USS Enterprise-D, and the USS Enterprise-E."
		
	}
	
	def mostRecentAssignment = { attrs ->
		if (!attrs.person) {
			throwTagError('Tag ["mostRecentAssignment"] missing required attribute ["person"]')
		}
		
		def p = attrs.remove('person')
		def a = p.assignments.sort { it.yearFrom }.last()
		if (a) {
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
