package org.kraken

import spock.lang.Specification


class TestControllerSpec extends Specification {

    void"test sum"(){
        given:
        int i = 1

        when:
        i = i+1

        then:
        i == 2
    }
}