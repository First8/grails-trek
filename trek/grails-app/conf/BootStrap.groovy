import nl.first8.trek.*

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
		def fixture = fixtureLoader.load("organizations").load("spaceships").load("persons")
		assert Person.count() > 0
		
	}
}
