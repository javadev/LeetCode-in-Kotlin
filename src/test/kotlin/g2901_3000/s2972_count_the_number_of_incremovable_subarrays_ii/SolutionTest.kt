package g2901_3000.s2972_count_the_number_of_incremovable_subarrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun incremovableSubarrayCount() {
        assertThat(
            Solution().incremovableSubarrayCount(intArrayOf(1, 2, 3, 4)),
            equalTo(10L),
        )
    }

    @Test
    fun incremovableSubarrayCount2() {
        assertThat(Solution().incremovableSubarrayCount(intArrayOf(6, 5, 7, 8)), equalTo(7L))
    }

    @Test
    fun incremovableSubarrayCount3() {
        assertThat(Solution().incremovableSubarrayCount(intArrayOf(8, 7, 6, 6)), equalTo(3L))
    }
}
