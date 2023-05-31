package g1101_1200.s1108_defanging_an_ip_address

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun defangIPaddr() {
        assertThat(Solution().defangIPaddr("1.1.1.1"), equalTo("1[.]1[.]1[.]1"))
    }

    @Test
    fun defangIPaddr2() {
        assertThat(Solution().defangIPaddr("255.100.50.0"), equalTo("255[.]100[.]50[.]0"))
    }
}
