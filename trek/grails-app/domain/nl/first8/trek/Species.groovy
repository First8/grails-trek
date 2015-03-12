package nl.first8.trek

import groovy.transform.ToString
/**
 * We're representing humanoid species only in this application. 
 * 
 */
@ToString
class Species {

	String name
	Homeworld homeworld
	
    static constraints = {
    }
}
