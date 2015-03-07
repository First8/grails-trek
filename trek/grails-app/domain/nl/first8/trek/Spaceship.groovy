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
		name()
		registry()
		spaceshipClass()
		operatedBy()
		mediaPath nullable: true
    }
	
	String toString() { name }
}
