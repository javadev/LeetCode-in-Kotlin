package g1201_1300.s1247_minimum_swaps_to_make_strings_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSwap() {
        assertThat(Solution().minimumSwap("xx", "yy"), equalTo(1))
    }

    @Test
    fun minimumSwap2() {
        assertThat(Solution().minimumSwap("xy", "yx"), equalTo(2))
    }

    @Test
    fun minimumSwap3() {
        assertThat(Solution().minimumSwap("xx", "xy"), equalTo(-1))
    }
}
