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
				(it != "Millennium Falcon" && it != "Star Destroyer") ?: 'spaceship.name.validator.wrong.universe.message'  
			} 
		)
		registry()
		spaceshipClass()
		operatedBy()
		mediaPath nullable: true
    }
	
	String toString() { name }
}
