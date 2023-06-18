package g1701_1800.s1799_maximize_score_after_n_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat(Solution().maxScore(intArrayOf(1, 2)), equalTo(1))
    }

    @Test
    fun maxScore2() {
        assertThat(Solution().maxScore(intArrayOf(3, 4, 6, 8)), equalTo(11))
    }

    @Test
    fun maxScore3() {
        assertThat(Solution().maxScore(intArrayOf(1, 2, 3, 4, 5, 6)), equalTo(14))
    }
}
