package nl.first8.trek.security

import nl.first8.trek.Person

/**
 * User which would otherwise we provided with some security framework
 * such as e.g. Spring Security.
 */
class User {
	
	String userName
	String password
	
	/** Associated person. */
	Person person
	
	static mapping = {
		id column: 'userName'
	}

    static constraints = {
		userName nullable: false, unique: true
		password blank: false
		person nullable: false
    }
	
	String toString() { userName }
}
