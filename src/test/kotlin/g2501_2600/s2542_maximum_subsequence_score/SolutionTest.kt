package g2501_2600.s2542_maximum_subsequence_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat(
            Solution().maxScore(intArrayOf(1, 3, 3, 2), intArrayOf(2, 1, 3, 4), 3),
            equalTo(12L)
        )
    }

    @Test
    fun maxScore2() {
        assertThat(
            Solution().maxScore(intArrayOf(4, 2, 3, 1, 1), intArrayOf(7, 5, 10, 9, 6), 1),
            equalTo(30L)
        )
    }
}
