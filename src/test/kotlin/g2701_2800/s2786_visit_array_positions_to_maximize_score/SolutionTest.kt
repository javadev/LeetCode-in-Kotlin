package g2701_2800.s2786_visit_array_positions_to_maximize_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat(Solution().maxScore(intArrayOf(2, 3, 6, 1, 9, 2), 5), equalTo(13))
    }

    @Test
    fun maxScore2() {
        assertThat(Solution().maxScore(intArrayOf(2, 4, 6, 8), 3), equalTo(20))
    }
}
