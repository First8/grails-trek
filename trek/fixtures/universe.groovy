import nl.first8.trek.*

/**
 * This is a "fixture" file. Very usable to load fixed sets of data
 * through the Grails Fixtures Plugin.
 * 
 * @see http://grails.org/plugin/fixtures
 */
fixture {
	
	// organizations
	starfleet(Organization, name: "Starfleet")
	
	// quadrants
	alphaQuadrant(Quadrant, name: "Alpha Quadrant")
	betaQuadrant(Quadrant, name: "Beta Quadrant")
	gammaQuadrant(Quadrant, name: "Gamma Quadrant")
	deltaQuadrant(Quadrant, name: "Delta Quadrant")
	
	// and some homeworlds, set them in a quadrant
	earthHomeworld(Homeworld, name: "Earth", quadrant: alphaQuadrant)
	vulcanHomeworld(Homeworld, name: "Vulcan", quadrant: alphaQuadrant)
	
	// some species
	humanSpecies(Species, name: "Human", homeworld: earthHomeworld)
	vothSpecies(Species, name: "Voth", homeworld: earthHomeworld)
	vulcanSpecies(Species, name: "Vulcan", homeworld: vulcanHomeworld)
}