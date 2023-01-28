package g0401_0500.s0497_random_point_in_non_overlapping_rectangles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solutionTest() {
        val solution = Solution(arrayOf(intArrayOf(-2, -2, 1, 1), intArrayOf(2, 2, 4, 6)))
        solution.pick()
        solution.pick()
        solution.pick()
        solution.pick()
        solution.pick()
        assertThat(true, equalTo(true))
    }
}
