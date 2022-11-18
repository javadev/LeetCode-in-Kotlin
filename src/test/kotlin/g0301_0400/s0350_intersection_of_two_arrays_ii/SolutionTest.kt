package g0301_0400.s0350_intersection_of_two_arrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun intersect() {
        assertThat(
            Solution().intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)),
            equalTo(intArrayOf(2, 2))
        )
    }

    @Test
    fun intersect2() {
        assertThat(
            Solution().intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)),
            equalTo(intArrayOf(9, 4))
        )
    }
}
