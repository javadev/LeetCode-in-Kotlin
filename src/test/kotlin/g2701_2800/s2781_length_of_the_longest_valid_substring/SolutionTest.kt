package g2701_2800.s2781_length_of_the_longest_valid_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestValidSubstring() {
        assertThat(
            Solution().longestValidSubstring("cbaaaabc", mutableListOf("aaa", "cb")),
            equalTo(4),
        )
    }

    @Test
    fun longestValidSubstring2() {
        assertThat(
            Solution().longestValidSubstring("leetcode", mutableListOf("de", "le", "e")),
            equalTo(4),
        )
    }
}
