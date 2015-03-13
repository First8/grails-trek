package nl.first8.trek

import grails.converters.JSON

class AssignmentController {
    static scaffold = true
	
	def missionService
	
	def debug(String name) {
		render missionService.listPlots(name) as JSON
	}
}
