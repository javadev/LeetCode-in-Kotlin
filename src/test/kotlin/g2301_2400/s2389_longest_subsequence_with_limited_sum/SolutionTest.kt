package g2301_2400.s2389_longest_subsequence_with_limited_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun answerQueries() {
        assertThat(
            Solution().answerQueries(intArrayOf(4, 5, 2, 1), intArrayOf(3, 10, 21)),
            equalTo(intArrayOf(2, 3, 4)),
        )
    }

    @Test
    fun answerQueries2() {
        assertThat(
            Solution().answerQueries(intArrayOf(2, 3, 4, 5), intArrayOf(1)),
            equalTo(intArrayOf(0)),
        )
    }
}
