package g0301_0400.s0384_shuffle_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solutionTest() {
        val solution = Solution(intArrayOf(1, 2, 3))
        val shuffled = solution.shuffle()
        shuffled.sort()
        assertThat(shuffled, equalTo(intArrayOf(1, 2, 3)))
        assertThat(solution.reset(), equalTo(intArrayOf(1, 2, 3)))
    }
}
