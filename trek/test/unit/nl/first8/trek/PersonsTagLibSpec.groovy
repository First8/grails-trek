package nl.first8.trek

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(PersonsTagLib)
class PersonsTagLibSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	void "test bio tag"() {

		given:
		String tag = '<person:bio person="${p}" />'

		expect:
		applyTemplate(tag, [p: new Person(bio: "")]) == ''
		applyTemplate(tag, [p: new Person(bio: "Deanna Troi is")]) == '<p class="lead">Deanna Troi is.</p>'
		applyTemplate(tag, [p: new Person(bio: "Deanna Troi is.")]) == '<p class="lead">Deanna Troi is.</p>'
		applyTemplate(tag, [p: new Person(bio: "Deanna Troi is. She served as counselor.")]) == '<p class="lead">Deanna Troi is.</p><p>She served as counselor.</p>'
		applyTemplate(tag, [p: new Person(bio: "Deanna Troi is. She served as counselor. Third line.")]) == '<p class="lead">Deanna Troi is.</p><p>She served as counselor. Third line.</p>'

	}
}
