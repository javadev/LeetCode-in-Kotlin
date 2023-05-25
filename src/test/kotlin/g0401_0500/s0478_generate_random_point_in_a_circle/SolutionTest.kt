package g0401_0500.s0478_generate_random_point_in_a_circle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun randPoint() {
        val solution = Solution(1.0, 0.0, 0.0)
        solution.randPoint()
        solution.randPoint()
        solution.randPoint()
        assertThat(solution, equalTo(solution))
    }
}
