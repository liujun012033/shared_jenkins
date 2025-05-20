// test/com/bne/utils/UtilsTest.groovy
import spock.lang.Specification

class UtilsTest extends Specification {
    def "should print hello"() {
        given:
        def script = Mock(Jenkinsfile)

        when:
        Utils.printHello(script)

        then:
        1 * script.echo('Hello from shared library!')
    }
}