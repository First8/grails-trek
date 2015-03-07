package nl.first8.trek

class Person {
	
	enum Gender {
		M, F
	}
		
	String name
	String rank
	Gender gender = Gender.M
	Date birthDate
	Organization worksFor
	String mediaPath
	String bio
	
	static hasMany = [assignments : Assignment]

    static constraints = {
		name blank: false, unique: true
		rank nullable: false
		gender nullable: true
		birthDate nullable: true
		worksFor nullable: false
		mediaPath nullable: true
		bio nullable: true, maxSize: 5000
    }
	
	String toString() { name }
}
