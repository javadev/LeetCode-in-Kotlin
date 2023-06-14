package g1501_1600.s1590_make_sum_divisible_by_p

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSubarray() {
        assertThat(Solution().minSubarray(intArrayOf(3, 1, 4, 2), 6), equalTo(1))
    }

    @Test
    fun minSubarray2() {
        assertThat(Solution().minSubarray(intArrayOf(6, 3, 5, 2), 9), equalTo(2))
    }

    @Test
    fun minSubarray3() {
        assertThat(Solution().minSubarray(intArrayOf(1, 2, 3), 3), equalTo(0))
    }
}
