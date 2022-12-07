package g0301_0400.s0398_random_pick_index

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pick() {
        val input = intArrayOf(1, 2, 3, 3, 3)
        val solution = Solution(input)
        assertThat(listOf(2, 3, 4).contains(solution.pick(3)), equalTo(true))
        assertThat(solution.pick(1), equalTo(0))
        assertThat(listOf(2, 3, 4).contains(solution.pick(3)), equalTo(true))
    }
}
