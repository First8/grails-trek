package nl.first8.trek

import groovy.transform.ToString

@ToString
class Homeworld {
	String name
	Quadrant quadrant
	
    static constraints = {
    }
}
