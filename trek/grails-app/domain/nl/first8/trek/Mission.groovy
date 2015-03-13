package nl.first8.trek

import groovy.json.JsonSlurper

class Mission {

	String text
	
	def getMissionExcerpt() {
		def json = new JsonSlurper().parseText(text)
		return json
	}
	
    static constraints = {
		text nullable: true, maxSize: 5000
    }
}
