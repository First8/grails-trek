package nl.first8.trek

class Mission {

	String text
	
    static constraints = {
		text nullable: true, maxSize: 5000
    }
}
