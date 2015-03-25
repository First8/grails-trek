package nl.first8.trek

class SpaceshipClassController {
	
    static scaffold = true
	
	/**
	 * TODO16: When a space ship class is created, often a new organization needs to go with it.
	 * Problem: Whenever a save fails (for instance, the name is not unique) the organization is still saved.
	 * 
	 * Since controller methods are not automatically transactional, we would like to handle
	 * the action in a more transactional way, in a service method. Create a service method and
	 * use it here to either have the two changes successful or have both fail together.
	 */
	def save(SpaceshipClass instance) {
		log.info "Creating new space ship class ${instance?.name}"
		
		// save new organization if custom named one is not available yet
		if (instance.operatedBy && !Organization.findByName(instance?.operatedBy.name)) {
			Organization saved = new Organization(name: instance?.operatedBy.name).save()
			instance.operatedBy = saved			
		}
		
		instance.save()
		
		redirect action: "list"
	}
	
}
