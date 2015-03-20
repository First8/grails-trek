package nl.first8.trek

import groovy.json.JsonSlurper
import groovy.transform.ToString

import javax.persistence.Transient


class Mission {

	String text
	
	@Transient
	MissionExcerpt getMissionExcerpt() {
		def json = new JsonSlurper().parseText(text)
		def firstPage = json?.query?.pages?.values()[0]
		return new MissionExcerpt(
			title: firstPage?.title,
			excerpt: firstPage?.revisions ? firstPage?.revisions[0]?."*" : null
		)	
	}
	
    static constraints = {
		text nullable: true, maxSize: 5000
    }
	
	@Override
	public String toString() {
		return missionExcerpt.title
	}
	
}

@ToString
class MissionExcerpt {
	String title
	String excerpt
}
