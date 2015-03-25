package nl.first8.trek

import grails.converters.JSON

/**
 * No view here yet. The data is directly 'render'-ed to the output in JSON format.
 * In standard Spring MVC that Grails uses, a model (object) would be returned to the view. 
 *
 * TODO17: Create a view that displays the various plots. Note that the current JSON format
 *  may not be the most suitable structure to select from in a view. 
 */
class MissionController {
	
	def missionService
	
	def debug(String name) {
		render missionService.listPlots(name) as JSON
	}
	
}
