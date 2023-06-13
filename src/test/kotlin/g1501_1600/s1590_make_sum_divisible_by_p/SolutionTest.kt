package g1501_1600.s1590_make_sum_divisible_by_p

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSubarray() {
        MatcherAssert.assertThat(Solution().minSubarray(intArrayOf(3, 1, 4, 2), 6), CoreMatchers.equalTo(1))
    }

    @Test
    fun minSubarray2() {
        MatcherAssert.assertThat(Solution().minSubarray(intArrayOf(6, 3, 5, 2), 9), CoreMatchers.equalTo(2))
    }

    @Test
    fun minSubarray3() {
        MatcherAssert.assertThat(Solution().minSubarray(intArrayOf(1, 2, 3), 3), CoreMatchers.equalTo(0))
    }
}
