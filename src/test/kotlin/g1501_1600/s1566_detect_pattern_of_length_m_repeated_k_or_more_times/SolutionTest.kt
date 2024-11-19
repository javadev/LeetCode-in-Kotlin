package g1501_1600.s1566_detect_pattern_of_length_m_repeated_k_or_more_times

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containsPattern() {
        assertThat(
            Solution().containsPattern(intArrayOf(1, 2, 4, 4, 4, 4), 1, 3),
            equalTo(true),
        )
    }

    @Test
    fun containsPattern2() {
        assertThat(
            Solution().containsPattern(intArrayOf(1, 2, 1, 2, 1, 1, 1, 3), 2, 2),
            equalTo(true),
        )
    }

    @Test
    fun containsPattern3() {
        assertThat(
            Solution().containsPattern(intArrayOf(1, 2, 1, 2, 1, 3), 2, 3),
            equalTo(false),
        )
    }
}
