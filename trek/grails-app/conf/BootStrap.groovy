import nl.first8.trek.*

class BootStrap {

    def init = { servletContext ->
		if (Person.count == 0) {
			loadDefaultContent()
		}
    }
    def destroy = {
    }
	
	void loadDefaultContent() {
		
		// organizations
    	def starfleet = new Organization(name: "Starfleet")
		starfleet.save()
		
		// spaceship classes
		def galaxyClass = new SpaceshipClass(name: "Galaxy", operatedBy: starfleet, length: 642.51, width: 463.73, height: 195.26)
		def constellationClass = new SpaceshipClass(name: "Constellation", operatedBy: starfleet, length: 310, width: 75, height: 86)
		[galaxyClass, constellationClass]*.save()
		
		// spaceships
		new Spaceship(name: "USS Enterprise", registry: "NCC-1701-D", spaceshipClass: galaxyClass, operatedBy: starfleet).save()
		new Spaceship(name: "USS Enterprise", registry: "NCC-1701-E", spaceshipClass: galaxyClass, operatedBy: starfleet).save()
		new Spaceship(name: "USS Stargazer", registry: "NCC-2893", spaceshipClass: constellationClass, operatedBy: starfleet).save()
		
		// persons
		def jeanLuc = new Person(name: "Jean-Luc Picard", rank: "Captain", birthDate: new Date("2305/6/13"), worksFor: starfleet)
		[jeanLuc]*.save()
		
		// assignments
		new Assignment(who: jeanLuc, spaceship: Spaceship.findByName("USS Stargazer"), occupation: "Commanding officer", yearFrom: 2333, yearTo: 2355).save()
		new Assignment(who: jeanLuc, spaceship: Spaceship.findByNameAndRegistry("USS Enterprise", "NCC-1701-D"), occupation: "Commanding officer", yearFrom: 2364, yearTo: 2371).save()
		new Assignment(who: jeanLuc, spaceship: Spaceship.findByNameAndRegistry("USS Enterprise", "NCC-1701-E"), occupation: "Commanding officer", yearFrom: 2372).save()
	}
}
