package g0501_0600.s0528_random_pick_with_weight

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solutionTest() {
        assertThat(Solution(intArrayOf(1)).pickIndex(), equalTo(0))
    }

    @Test
    fun solutionTest2() {
        val solution = Solution(intArrayOf(1, 3))
        assertThat(listOf(0, 1).contains(solution.pickIndex()), equalTo(true))
        assertThat(listOf(0, 1).contains(solution.pickIndex()), equalTo(true))
        assertThat(listOf(0, 1).contains(solution.pickIndex()), equalTo(true))
        assertThat(listOf(0, 1).contains(solution.pickIndex()), equalTo(true))
        assertThat(listOf(0, 1).contains(solution.pickIndex()), equalTo(true))
    }
}
