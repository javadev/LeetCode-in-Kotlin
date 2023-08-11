package g2501_2600.s2587_rearrange_array_to_maximize_prefix_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat(Solution().maxScore(intArrayOf(2, -1, 0, 1, -3, 3, -3)), equalTo(6))
    }

    @Test
    fun maxScore2() {
        assertThat(Solution().maxScore(intArrayOf(-2, -3, 0)), equalTo(0))
    }
}
