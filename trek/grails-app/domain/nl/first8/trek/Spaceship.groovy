package nl.first8.trek

/**
 * Starship, spaceship or spacecraft.
 *
 */
class Spaceship {
	
	String name
	String registry
	SpaceshipClass spaceshipClass
	Organization operatedBy
	String mediaPath

    static constraints = {
		name(
			validator: { 
				(it != "Millennium Falcon" && it != "Star Destroyer") ?: 'spaceship.name.validator.wrong.universe.message' //custom validator, see http://grails.github.io/grails-doc/2.4.4/ref/Constraints/validator.html
			} 
		)
		registry()
		spaceshipClass()
		operatedBy()
		mediaPath nullable: true
    }
	
	String toString() { name }
}
