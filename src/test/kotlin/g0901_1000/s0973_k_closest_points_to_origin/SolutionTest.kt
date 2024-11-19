package g0901_1000.s0973_k_closest_points_to_origin

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kClosest() {
        assertThat(
            Solution().kClosest(arrayOf(intArrayOf(1, 3), intArrayOf(-2, 2)), 1),
            equalTo(arrayOf(intArrayOf(-2, 2))),
        )
    }

    @Test
    fun kClosest2() {
        assertThat(
            Solution().kClosest(arrayOf(intArrayOf(3, 3), intArrayOf(5, -1), intArrayOf(-2, 4)), 2),
            equalTo(arrayOf(intArrayOf(3, 3), intArrayOf(-2, 4))),
        )
    }
}
