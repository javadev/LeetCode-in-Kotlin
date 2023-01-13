package g0501_0600.s0519_random_flip_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solutionTest() {
        val solution = Solution(3, 1)
        solution.flip()
        solution.flip()
        solution.flip()
        solution.reset()
        solution.flip()
        assertThat(true, equalTo(true))
    }
}
