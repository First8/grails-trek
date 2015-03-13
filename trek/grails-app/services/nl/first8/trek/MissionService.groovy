package nl.first8.trek

import grails.transaction.Transactional

@Transactional
class MissionService {

    def listPlots(String name) {
		
		List namedMissions = Mission.list().findAll { Mission it ->
			it.missionExcerpt.excerpt?.contains(name)
		}
		
		namedMissions.each {
			log.info "Found ${it}"
		}
		
    }
}
