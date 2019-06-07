package s0003.longest.substring.without.repeating.characters

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun lengthOfLongestSubstring() {
        assertThat(Solution().lengthOfLongestSubstring("abcabcbb"), equalTo(3))
    }
}
