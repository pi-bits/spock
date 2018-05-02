import spock.lang.Specification

class FirstSpecification extends Specification {
    def "one plus one should equal two"() {
        expect:
        1 + 1 == 2
    }

    def "two plus two equal to four"() {
        given:
        int left = 2;
        int right = 2;

        when:
        int result = left + right

        then:
        result == 4

    }

    def "should be able to remove from the list"() {
        given:
        def list = [1, 2, 3, 4];

        when:
        list.remove(0)

        then:
        list == [2, 3, 4]
    }
    def "should get exception when removing non-existent item from the list"()
    {
        given:
        def list = [1,2,3,4]

        when:
        list.remove(10);

        then:
        thrown(IndexOutOfBoundsException.class);
        list.size()==4;
    }

    def "numbers to the power of two"()
    {

        expect:
        Math.pow(a,b)==c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }
}