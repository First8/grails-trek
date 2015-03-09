package nl.first8.trek

/**
 * The classification of a spaceship.
 * 
 * @see <a href="http://memory-beta.wikia.com/wiki/Federation_starship_classes">Federation starship classes</a>
 * <img src="http://vignette3.wikia.nocookie.net/startrek/images/f/fd/Babcock_class_schematic.jpg/revision/latest?cb=20150309040620" width="300" />
 */
class SpaceshipClass {
	
	String name
	Organization operatedBy
	String mediaPath
	
	// dimensions
	Double length
	Double width
	Double height 
	

    static constraints = {
		name blank: false, unique: true
		length nullable: true
		width nullable: true
		height nullable: true
		mediaPath nullable: true
    }
	
	String toString() { name }
}
