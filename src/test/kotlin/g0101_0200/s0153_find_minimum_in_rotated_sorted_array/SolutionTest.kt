package g0101_0200.s0153_find_minimum_in_rotated_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMin() {
        assertThat(Solution().findMin(intArrayOf(3, 4, 5, 1, 2)), equalTo(1))
    }

    @Test
    fun findMin2() {
        assertThat(Solution().findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)), equalTo(0))
    }

    @Test
    fun findMin3() {
        assertThat(Solution().findMin(intArrayOf(11, 13, 15, 17)), equalTo(11))
    }
}
