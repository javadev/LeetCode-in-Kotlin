package g1301_1400.s1371_find_the_longest_substring_containing_vowels_in_even_counts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheLongestSubstring() {
        assertThat(Solution().findTheLongestSubstring("eleetminicoworoep"), equalTo(13))
    }

    @Test
    fun findTheLongestSubstring2() {
        assertThat(Solution().findTheLongestSubstring("leetcodeisgreat"), equalTo(5))
    }

    @Test
    fun findTheLongestSubstring3() {
        assertThat(Solution().findTheLongestSubstring("bcbcbc"), equalTo(6))
    }
}
