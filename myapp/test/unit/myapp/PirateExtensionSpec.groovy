package myapp

import spock.lang.Specification

class PirateExtensionSpec extends Specification {

    def "likeAPirate method should work as instance method on a String value"() {
        given:
        final String originalText = "Hi, Groovy is the greatest language of the JVM."

        expect:
        originalText.likeAPirate() == "Yo-ho-ho, Groovy be th' greatest language o' th' JVM."
    }

}