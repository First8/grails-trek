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
		def users = [] //new list
		users << new User(userName: "jeanluc", password: "123", person: Person.findByName("Jean-Luc Picard")).save() //"The save method returns (...) the instance itself if successful."
		users << new User(userName: "worf", password: "123", person: Person.findByName("Worf")).save()
		users.each { 
			log.info("There is a user in the database with user name ${it.userName} and password ${it.password}")
		}
	}
}
