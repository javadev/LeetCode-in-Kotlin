package g2701_2800.s2730_find_the_longest_semi_repetitive_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSemiRepetitiveSubstring() {
        assertThat(Solution().longestSemiRepetitiveSubstring("52233"), equalTo(4))
    }

    @Test
    fun longestSemiRepetitiveSubstring2() {
        assertThat(Solution().longestSemiRepetitiveSubstring("5494"), equalTo(4))
    }

    @Test
    fun longestSemiRepetitiveSubstring3() {
        assertThat(Solution().longestSemiRepetitiveSubstring("1111111"), equalTo(2))
    }
}
