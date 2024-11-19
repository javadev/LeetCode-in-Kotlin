package g0301_0400.s0378_kth_smallest_element_in_a_sorted_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallest() {
        assertThat(
            Solution().kthSmallest(arrayOf(intArrayOf(1, 5, 9), intArrayOf(10, 11, 13), intArrayOf(12, 13, 15)), 8),
            equalTo(13),
        )
    }

    @Test
    fun kthSmallest2() {
        assertThat(Solution().kthSmallest(arrayOf(intArrayOf(-5)), 1), equalTo(-5))
    }
}
