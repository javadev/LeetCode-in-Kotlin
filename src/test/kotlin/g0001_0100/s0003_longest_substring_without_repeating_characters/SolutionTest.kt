package g0001_0100.s0003_longest_substring_without_repeating_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthOfLongestSubstring() {
        assertThat(Solution().lengthOfLongestSubstring("abcabcbb"), equalTo(3))
    }

    @Test
    fun lengthOfLongestSubstring2() {
        assertThat(Solution().lengthOfLongestSubstring("bbbbb"), equalTo(1))
    }

    @Test
    fun lengthOfLongestSubstring3() {
        assertThat(Solution().lengthOfLongestSubstring("pwwkew"), equalTo(3))
    }
}
