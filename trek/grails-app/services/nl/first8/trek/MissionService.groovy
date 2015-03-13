package nl.first8.trek

import grails.transaction.Transactional

@Transactional
class MissionService {

    List<String> listPlots(String name) {
		
		List<Mission> namedMissions = Mission.list().findAll { Mission it ->
			it.missionExcerpt.excerpt?.contains(name)
		}
		
		namedMissions.each { Mission it ->
			log.info "Found ${it}"
		}
		
		return namedMissions.collect { Mission it ->
			it.missionExcerpt.excerpt
		}
		
    }
}
