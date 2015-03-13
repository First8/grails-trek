package nl.first8.trek

class Person {
	//TODON  take a look in the dbconsole (see Admin menu in your browser) to see how domain classes end up in the database.
	//       In the back-end, GORM (Grails Object Relational Mapping), http://grails.github.io/grails-doc/2.4.4/guide/GORM.html,
	//       uses hibernate.
	//       Questions to ask yourself:
	//       - where did the id field come from? Hint: convention over configuration.
	//       - what happened to the Gender?
	
	
	enum Gender {
		M, F
	}
		
	String name
	Species species
	Rank rank
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
		species nullable: true
    }
	
	String toString() { name }
}
