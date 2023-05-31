package g1101_1200.s1108_defanging_an_ip_address

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun defangIPaddr() {
        MatcherAssert.assertThat(Solution().defangIPaddr("1.1.1.1"), CoreMatchers.equalTo("1[.]1[.]1[.]1"))
    }

    @Test
    fun defangIPaddr2() {
        MatcherAssert.assertThat(Solution().defangIPaddr("255.100.50.0"), CoreMatchers.equalTo("255[.]100[.]50[.]0"))
    }
}
