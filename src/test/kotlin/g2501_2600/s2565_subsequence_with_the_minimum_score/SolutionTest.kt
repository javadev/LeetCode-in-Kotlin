package g2501_2600.s2565_subsequence_with_the_minimum_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumScore() {
        assertThat(
            Solution().minimumScore("abacaba", "bzaa"),
            equalTo(1),
        )
    }

    @Test
    fun minimumScore2() {
        assertThat(
            Solution().minimumScore("cde", "xyz"),
            equalTo(3),
        )
    }
}
