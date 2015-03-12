import nl.first8.trek.*
import nl.first8.trek.security.User

class BootStrap {
	
	def fixtureLoader

    def init = { servletContext ->
		if (Person.count == 0) {
			loadDefaultContent()
		}
    }
    def destroy = {
    }
	
	void loadDefaultContent() {
		
		// load database content
		def fixture = fixtureLoader.load("universe").load("spaceships").load("persons")
		assert Person.count() > 0
		
		// create a few users to log in with
		new User(userName: "jeanluc", password: "123", person: Person.findByName("Jean-Luc Picard")).save()
		new User(userName: "worf", password: "123", person: Person.findByName("Worf")).save()
	}
}
