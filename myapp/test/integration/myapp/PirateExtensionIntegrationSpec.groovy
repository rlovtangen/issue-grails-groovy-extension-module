package myapp

import grails.test.spock.IntegrationSpec

class PirateExtensionIntegrationSpec extends IntegrationSpec {

    def "likeAPirate method should work as instance method on a String value"() {
        given:
        final String originalText = "Hi, Groovy is the greatest language of the JVM."

        expect:
        originalText.likeAPirate() == "Yo-ho-ho, Groovy be th' greatest language o' th' JVM."
    }

}
