package nl.first8.trek

import grails.transaction.Transactional

@Transactional
class MissionService {

    def listPlots(String name) {
		
		Mission.all.findAll { Mission it ->
			println it.missionExcerpt
		}
		
    }
}
