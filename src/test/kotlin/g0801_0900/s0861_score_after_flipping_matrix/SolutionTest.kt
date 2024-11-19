package g0801_0900.s0861_score_after_flipping_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matrixScore() {
        assertThat(
            Solution().matrixScore(arrayOf(intArrayOf(0, 0, 1, 1), intArrayOf(1, 0, 1, 0), intArrayOf(1, 1, 0, 0))),
            equalTo(39),
        )
    }

    @Test
    fun matrixScore2() {
        assertThat(Solution().matrixScore(arrayOf(intArrayOf(0))), equalTo(1))
    }
}
