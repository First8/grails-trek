package nl.first8.trek

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.mixin.Mock

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(MissionService)
@Mock(Mission)
class MissionServiceSpec extends Specification {

	def setup() {
		//load some Missions
		def missions = []
		missions.add(new Mission(text: """
{"query":{"pages":{"41583":{"pageid":41583,"ns":0,"title":"Some mission 1","revisions":[{"*":"Spock said: 'Live long and prosper'"}]}}}}"""))
		missions.add(new Mission(text: """
{"query":{"pages":{"41583":{"pageid":41583,"ns":0,"title":"Some mission 2","revisions":[{"*":"Spock spoke the words 'HIGHLY ILLOGICAL...'"}]}}}}"""))
		missions.add(new Mission(text: """
{"query":{"pages":{"41583":{"pageid":41583,"ns":0,"title":"Some mission 3","revisions":[{"*":"The Vulcan has spocken"}]}}}}"""))


		missions.each { mission ->
			mission.save()
		}

	}

	def cleanup() {
	}

	//TODON you can use a String as test method name, as long as it starts with "test". Make the method name more readable.
	//TODO you don't need to say assert, Spock knows you're going to assert stuff in the 'then'-block. Remove the asserts, and run the tests again
	//TODO hmm, now you still have 2 tests that seem to work almost the same. That's not DRY! Can you combine them using Spock's Data Driven features? @see https://searchcode.com/codesearch/view/50544801/
	void testListPlotsIsCaseSensitive() {
		given: "some search string the user entered"
		String input = 'Spock'

		when: "calling our method with that search string"
		def excerpts = service.listPlots(input)

		then: "we're expecting the excerpts of the first 2 Missions"
		assert excerpts.size() == 2
		["Spock said: 'Live long and prosper'", "Spock spoke the words 'HIGHLY ILLOGICAL...'"].each { excerpt ->
			assert excerpts.contains(excerpt)
		}
	}

	void testListPlotsReturnsAllMissionsForEmptyInput() {
		given: "some search string the user entered"
		String input = ''

		when: "calling our method with that search string"
		def excerpts = service.listPlots(input)

		then: "we're expecting the excerpts of all Missions"
		assert excerpts.size() == 3
		["Spock said: 'Live long and prosper'", "Spock spoke the words 'HIGHLY ILLOGICAL...'", "The Vulcan has spocken"].each { excerpt ->
			assert excerpts.contains(excerpt)
		}
	}
}
