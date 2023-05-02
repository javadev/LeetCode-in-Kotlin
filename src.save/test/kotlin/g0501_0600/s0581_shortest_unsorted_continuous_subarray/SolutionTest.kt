package g0501_0600.s0581_shortest_unsorted_continuous_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findUnsortedSubarray() {
        assertThat(
            Solution().findUnsortedSubarray(intArrayOf(2, 6, 4, 8, 10, 9, 15)), equalTo(5)
        )
    }

    @Test
    fun findUnsortedSubarray2() {
        assertThat(Solution().findUnsortedSubarray(intArrayOf(1, 2, 3, 4)), equalTo(0))
    }

    @Test
    fun findUnsortedSubarray3() {
        assertThat(Solution().findUnsortedSubarray(intArrayOf(1)), equalTo(0))
    }
}
