package g2901_3000.s2968_apply_operations_to_maximize_frequency_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFrequencyScore() {
        assertThat(Solution().maxFrequencyScore(intArrayOf(1, 2, 6, 4), 3), equalTo(3))
    }

    @Test
    fun maxFrequencyScore2() {
        assertThat(Solution().maxFrequencyScore(intArrayOf(1, 4, 4, 2, 4), 0), equalTo(3))
    }
}
