package nl.first8.trek

/**
 * The classification of a spaceship.
 * @see http://memory-beta.wikia.com/wiki/Federation_starship_classes
 */
class SpaceshipClass {
	
	String name
	Organization operatedBy
	
	// dimensions
	Double length
	Double width
	Double height 

    static constraints = {
		name blank: false, unique: true
		length nullable: true
		width nullable: true
		height nullable: true
    }
	
	String toString() { name }
}
