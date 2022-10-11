package g0101_0200.s0154_find_minimum_in_rotated_sorted_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMin() {
        assertThat(Solution().findMin(intArrayOf(1, 3, 5)), equalTo(1))
    }

    @Test
    fun findMin2() {
        assertThat(Solution().findMin(intArrayOf(2, 2, 2, 0, 1)), equalTo(0))
    }
}
