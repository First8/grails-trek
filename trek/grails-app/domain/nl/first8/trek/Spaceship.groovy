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

    static constraints = {
		name()
		registry()
		spaceshipClass()
		operatedBy()
    }
	
	String toString() { name }
}
