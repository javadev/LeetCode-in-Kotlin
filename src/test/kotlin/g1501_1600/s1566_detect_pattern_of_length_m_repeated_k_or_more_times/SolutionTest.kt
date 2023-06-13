package g1501_1600.s1566_detect_pattern_of_length_m_repeated_k_or_more_times

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containsPattern() {
        MatcherAssert.assertThat(
            Solution().containsPattern(intArrayOf(1, 2, 4, 4, 4, 4), 1, 3), CoreMatchers.equalTo(true)
        )
    }

    @Test
    fun containsPattern2() {
        MatcherAssert.assertThat(
            Solution().containsPattern(intArrayOf(1, 2, 1, 2, 1, 1, 1, 3), 2, 2),
            CoreMatchers.equalTo(true)
        )
    }

    @Test
    fun containsPattern3() {
        MatcherAssert.assertThat(
            Solution().containsPattern(intArrayOf(1, 2, 1, 2, 1, 3), 2, 3), CoreMatchers.equalTo(false)
        )
    }
}
