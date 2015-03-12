package nl.first8.trek

enum Rank {
	CAPTAIN("Captain"), 
	COMMANDER("Commander"),
	LIEUTENANT_COMMANDER("Lt. Commander"),
	LIEUTENANT("Lieutenant"),
	ENSIGN("Ensign"),
	CREWMAN("Crewman")
	
	final String value
	Rank(String value) { this.value = value	}
	String toString() { value }
}
