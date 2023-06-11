package g1501_1600.s1529_minimum_suffix_flips

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFlips() {
        MatcherAssert.assertThat(Solution().minFlips("10111"), CoreMatchers.equalTo(3))
    }

    @Test
    fun minFlips2() {
        MatcherAssert.assertThat(Solution().minFlips("101"), CoreMatchers.equalTo(3))
    }

    @Test
    fun minFlips3() {
        MatcherAssert.assertThat(Solution().minFlips("00000"), CoreMatchers.equalTo(0))
    }
}
