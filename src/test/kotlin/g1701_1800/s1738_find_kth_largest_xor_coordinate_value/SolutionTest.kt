package g1701_1800.s1738_find_kth_largest_xor_coordinate_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthLargestValue() {
        assertThat(Solution().kthLargestValue(arrayOf(intArrayOf(5, 2), intArrayOf(1, 6)), 1), equalTo(7))
    }

    @Test
    fun kthLargestValue2() {
        assertThat(Solution().kthLargestValue(arrayOf(intArrayOf(5, 2), intArrayOf(1, 6)), 2), equalTo(5))
    }

    @Test
    fun kthLargestValue3() {
        assertThat(Solution().kthLargestValue(arrayOf(intArrayOf(5, 2), intArrayOf(1, 6)), 3), equalTo(4))
    }
}
