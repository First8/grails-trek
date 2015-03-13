import nl.first8.trek.*

fixture {
	jeanLuc(Person) {
		name = "Jean-Luc Picard"
		mediaPath = "Jean-Luc Picard.jpg"
		species = humanSpecies
		rank = Rank.CAPTAIN
		birthDate = new Date("2305/6/13")
		worksFor = starfleet
		bio = '''Jean-Luc Picard was a celebrated Starfleet officer, archaeologist and diplomat who served during the latter two thirds of the 24th century. The highlights of his career were centered around assignments as commanding officer of the Federation starships: USS Stargazer, USS Enterprise-D, and the USS Enterprise-E.'''
		assignments = [
			new Assignment(spaceship: stargazer, occupation: "Commanding officer", yearFrom: 2333, yearTo: 2355),
			new Assignment(spaceship: enterpriseD, occupation: "Commanding officer", yearFrom: 2364, yearTo: 2371),
			new Assignment(spaceship: enterpriseE, occupation: "Commanding officer", yearFrom: 2372)
		]
	}
	william(Person) {
		name = "William T. Riker"
		mediaPath = "William Riker.jpg"
		rank = Rank.CAPTAIN
		birthDate = new Date("2335/3/20")
		worksFor = starfleet
		bio = '''William Thomas Riker was a noted Starfleet officer, perhaps best known for his long assignment as first officer under Captain Jean-Luc Picard aboard the USS Enterprise-D, and later the USS Enterprise-E. In 2379, he finally accepted a promotion as captain of the USS Titan.'''
		assignments = [
			new Assignment(spaceship: enterpriseD, occupation: "First officer", yearFrom: 2364, yearTo: 2371),
			new Assignment(spaceship: enterpriseE, occupation: "First officer", yearFrom: 2372, yearTo: 2379),
			new Assignment(spaceship: titan, occupation: "Commanding officer", yearFrom: 2379)
		]
	}
	ltData(Person) {
		name = "Data"
		mediaPath = "Data.jpg"
		rank = Rank.LIEUTENANT_COMMANDER
		birthDate = new Date("2338/2/2")
		worksFor = starfleet
		bio = '''Lieutenant Commander Data was a Soong-type android, the first and only such being to ever enter Starfleet. Data was created some time in the 2330s and was destroyed in 2379, sacrificing himself to save the crew of the USS Enterprise-E.'''
		assignments = [
			new Assignment(spaceship: enterpriseE, occupation: "Operations officer", yearFrom: 2372),
		]
	}
	geordi(Person) {
		name = "Geordi La Forge"
		mediaPath = "Geordi_La_Forge.jpg"
		rank = Rank.LIEUTENANT_COMMANDER
		birthDate = new Date("2335/2/16")
		worksFor = starfleet
		bio = '''Geordi La Forge was a Starfleet officer, who originally was the helmsman of the USS Enterprise-D during 2364, with the rank of lieutenant junior grade. He was promoted to the rank of lieutenant and later lieutenant commander and became the chief engineer of the Enterprise-D and later USS Enterprise-E, both under Captain Jean-Luc Picard. '''
		assignments = [
			new Assignment(spaceship: enterpriseE, occupation: "Chief engineer", yearFrom: 2372),
		]
	}
	worf(Person) {
		name = "Worf"
		mediaPath = "Worf.jpg"
		rank = Rank.LIEUTENANT_COMMANDER
		birthDate = new Date("2340/5/15")
		worksFor = starfleet
		bio = '''Worf - son of Mogh, of the Klingon House of Martok, of the Human family Rozhenko; mate to K'Ehleyr, father to Alexander Rozhenko, and husband to Jadzia Dax; Starfleet officer and soldier of the Empire; bane of the House of Duras; slayer of Gowron; Federation ambassador to Qo'noS - was one of the most influential Klingons of the latter half of the 24th century.'''
		assignments = [
			new Assignment(spaceship: enterpriseE, occupation: "Strategic operations officer", yearFrom: 2372),
		]
	}
	troi(Person) {
		name = "Deanna Troi"
		gender = "F"
		mediaPath = "Deanna_Troi.jpg"
		rank = Rank.COMMANDER
		birthDate = new Date("2336/3/29")
		worksFor = starfleet
		bio = '''Deanna Troi was a half-Betazoid, half-Human Starfleet officer. Under the command of Captain Jean-Luc Picard, she served as ship's counselor aboard the USS Enterprise-D and the USS Enterprise-E. In 2379, Troi transferred to the USS Titan.'''
		assignments = [
			new Assignment(spaceship: enterpriseE, occupation: "Counselor", yearFrom: 2372),
		]
	}
	beverly(Person) {
		name = "Beverly Crusher"
		gender = "F"
		mediaPath = "Beverly_Crusher.jpg"
		rank = Rank.COMMANDER
		birthDate = new Date("2324/10/13")
		worksFor = starfleet
		bio = '''Commander Beverly Cheryl Crusher, MD, was the chief medical officer aboard the USS Enterprise-D and its successor, the USS Enterprise-E, both under the command of Captain Jean-Luc Picard. She briefly left her post as CMO of the Enterprise-D to become head of Starfleet Medical, only to return shortly after. She was a Fellow of the Academy of Starfleet Surgeons. '''
		assignments = [
			new Assignment(spaceship: enterpriseE, occupation: "Chief medical officer", yearFrom: 2372),
		]
	}
	wesley(Person) {
		name = "Wesley Crusher"
		mediaPath = "Wesley_Crusher.jpg"
		rank = Rank.ENSIGN
		birthDate = new Date("2348/11/11")
		worksFor = starfleet
		bio = '''Commander Beverly Cheryl Crusher, MD, was the chief medical officer aboard the USS Enterprise-D and its successor, the USS Enterprise-E, both under the command of Captain Jean-Luc Picard. She briefly left her post as CMO of the Enterprise-D to become head of Starfleet Medical, only to return shortly after. She was a Fellow of the Academy of Starfleet Surgeons. '''
		assignments = [
			new Assignment(spaceship: stargazer, occupation: "-", yearFrom: 2333, yearTo: 2372),
			new Assignment(spaceship: enterpriseE, occupation: "Lieutenant junior grade", yearFrom: 2372),
		]
	}
	yar(Person) {
		name = "Natasha Yar"
		gender = "F"
		mediaPath = "Natasha_Yar.jpg"
		rank = Rank.LIEUTENANT
		birthDate = new Date("2337/7/14")
		worksFor = starfleet
		bio = '''Lieutenant Natasha Yar, better known as Tasha, was a Human Starfleet officer born on Turkana IV, and former security chief on the USS Enterprise-D. Unfortunately, Tasha was killed not even a year into the Enterprise's mission. She was fondly remembered by the Enterprise crew, and an alternate timeline version of Tasha indirectly played a very important role in Romulan politics.'''
		assignments = [
			new Assignment(spaceship: enterpriseD, occupation: "Tactical officer", yearFrom: 2363),
		]
	}
}