package s0004.median.of.two.sorted.arrays

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun findMedianSortedArrays() {
        assertThat(Solution().findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)), equalTo(2.0))
    }
}
