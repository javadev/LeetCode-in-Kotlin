package g2401_2500.s2416_sum_of_prefix_scores_of_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumPrefixScores() {
        assertThat(
            Solution().sumPrefixScores(arrayOf("abc", "ab", "bc", "b")),
            equalTo(intArrayOf(5, 4, 3, 2))
        )
    }

    @Test
    fun sumPrefixScores2() {
        assertThat(Solution().sumPrefixScores(arrayOf("abcd")), equalTo(intArrayOf(4)))
    }
}
