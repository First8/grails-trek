package nl.first8.trek

import nl.first8.trek.security.User

class Person {
	/*
	  <pre>
	TODON  take a look in the dbconsole (see Admin menu in the web application) to see how domain classes end up in the database.
	       Unfortunately, you might need to change the JDBC URL to jdbc:h2:mem:devDb yourself.
	
	       In the back-end, <a href='http://grails.github.io/grails-doc/2.4.4/guide/GORM.html'>GORM (Grails Object Relational Mapping</a>,
	       uses hibernate.
	       Questions to ask yourself:
	       - where did the id field come from? Hint: convention over configuration.
	       - what happened with the names of the fields?
	       - what happened to the Gender?
		</pre>
	*/
	
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
	
	def beforeDelete () {
		User.withNewSession {
		  User.findAllByPerson(this).each {User user ->
			user.delete(flush: true)
		  }
		}
	}
}
