package nl.first8.trek

/**
 * Assignment of someone to a vessel for a certain time range.
 */
class Assignment {
	
	Person who
	Spaceship spaceship
	String occupation
	Integer yearFrom
	Integer yearTo
	
	static belongsTo = Person

    static constraints = {
		who()
		spaceship()
		occupation blank: false
		yearFrom()
		yearTo nullable: true
    }
	
	String toString() {
		"$occupation, $spaceship.name ($yearFrom-" + (yearTo ?: "") + ")"
	}
}
