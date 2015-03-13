import nl.first8.trek.*
import nl.first8.trek.security.User

//TODON  The init closure in the BootStrap class is run at application startup, and could be used to initialize or check some stuff.
//       We use it to fill the in-memory database with some example data.
//
//       Assignment: add an extra user for one of the Persons in the database. Try to use that immediately. 
//       That should not work. Restart your application  (click the red stop button first).
//       Now try to log in again with your new user. Should work.

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
		
		// The Grails Fixtures Plugin is one of the many great plugins in the Grails universe.
		// In real-life applications, you could use it to easily create a good test data set.
		// @see http://grails.org/plugin/fixtures and http://gpc.github.com/grails-fixtures/ for documentation of this plugin.
		// @see the fixtures directory in the project for more information.
		def fixture = fixtureLoader.load("universe").load("spaceships").load("persons")
		assert Person.count() > 0
		
		// create a few users to log in with
		def users = [] //new list
		users.add(new User(userName: "jeanluc", password: "123", person: Person.findByName("Jean-Luc Picard")).save()) //"The save method returns (...) the instance itself if successful."
		users <<  new User(userName: "worf", password: "123", person: Person.findByName("Worf")).save()
		users.each { 
			log.info("There is a user in the database with user name ${it.userName} and password ${it.password}")
		}
	}
}
