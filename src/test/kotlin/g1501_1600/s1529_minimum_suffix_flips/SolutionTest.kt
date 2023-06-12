package g1501_1600.s1529_minimum_suffix_flips

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlips() {
        assertThat(Solution().minFlips("10111"), equalTo(3))
    }

    @Test
    fun minFlips2() {
        assertThat(Solution().minFlips("101"), equalTo(3))
    }

    @Test
    fun minFlips3() {
        assertThat(Solution().minFlips("00000"), equalTo(0))
    }
}
