package g1801_1900.s1888_minimum_number_of_flips_to_make_the_binary_string_alternating

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlips() {
        assertThat(Solution().minFlips("111000"), equalTo(2))
    }

    @Test
    fun minFlips2() {
        assertThat(Solution().minFlips("010"), equalTo(0))
    }

    @Test
    fun minFlips3() {
        assertThat(Solution().minFlips("1110"), equalTo(1))
    }
}
