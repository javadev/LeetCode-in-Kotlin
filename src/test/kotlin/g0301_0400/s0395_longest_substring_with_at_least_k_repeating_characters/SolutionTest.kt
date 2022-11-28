package g0301_0400.s0395_longest_substring_with_at_least_k_repeating_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubstring() {
        assertThat(Solution().longestSubstring("aaabb", 3), equalTo(3))
    }

    @Test
    fun longestSubstring2() {
        assertThat(Solution().longestSubstring("ababbc", 2), equalTo(5))
    }
}
