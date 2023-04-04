package g0801_0900.s0862_shortest_subarray_with_sum_at_least_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestSubarray() {
        assertThat(Solution().shortestSubarray(intArrayOf(1), 1), equalTo(1))
    }

    @Test
    fun shortestSubarray2() {
        assertThat(Solution().shortestSubarray(intArrayOf(1, 2), 4), equalTo(-1))
    }

    @Test
    fun shortestSubarray3() {
        assertThat(Solution().shortestSubarray(intArrayOf(2, -1, 2), 3), equalTo(3))
    }
}
