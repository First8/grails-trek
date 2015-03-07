import nl.first8.trek.*

//load "organizations"

fixture {
	
	// spaceship classes
	galaxyClass(SpaceshipClass, name: "Galaxy", operatedBy: starfleet, length: 642.51, width: 463.73, height: 195.26)
	constellationClass(SpaceshipClass, name: "Constellation", operatedBy: starfleet, length: 310, width: 75, height: 86)
	lunaClass(SpaceshipClass, name: "Luna", mediaPath: "USS_Titan.jpg", operatedBy: starfleet, length: 450)
	
	// spaceships
	enterpriseD(Spaceship, name: "USS Enterprise", registry: "NCC-1701-D", spaceshipClass: galaxyClass, operatedBy: starfleet)
	enterpriseE(Spaceship, name: "USS Enterprise", registry: "NCC-1701-E", spaceshipClass: galaxyClass, operatedBy: starfleet)
	stargazer(Spaceship, name: "USS Stargazer", registry: "NCC-2893", spaceshipClass: constellationClass, operatedBy: starfleet)
	titan(Spaceship, name: "USS Titan", registry: "NCC-80102", mediaPath: "USS_Titan.jpg", spaceshipClass: lunaClass, operatedBy: starfleet)
}
