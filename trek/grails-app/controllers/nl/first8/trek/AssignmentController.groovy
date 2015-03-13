package nl.first8.trek

class AssignmentController {
    static scaffold = true
	
	def missionService
	
	def debug() {
		
		missionService.listPlots("picard")
		
	}
}
