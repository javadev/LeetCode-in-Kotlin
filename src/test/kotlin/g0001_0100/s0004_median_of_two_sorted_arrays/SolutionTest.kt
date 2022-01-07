package g0001_0100.s0004_median_of_two_sorted_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun findMedianSortedArrays() {
        assertThat(Solution().findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)), equalTo(2.0))
    }
}
