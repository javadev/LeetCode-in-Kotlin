package g0701_0800.s0764_largest_plus_sign

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun orderOfLargestPlusSign() {
        assertThat(Solution().orderOfLargestPlusSign(5, arrayOf(intArrayOf(4, 2))), equalTo(2))
    }

    @Test
    fun orderOfLargestPlusSign2() {
        assertThat(Solution().orderOfLargestPlusSign(1, arrayOf(intArrayOf(0, 0))), equalTo(0))
    }
}
