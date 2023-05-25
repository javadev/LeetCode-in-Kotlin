package g1101_1200.s1163_last_substring_in_lexicographical_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastSubstring() {
        assertThat(Solution().lastSubstring("abab"), equalTo("bab"))
    }

    @Test
    fun lastSubstring2() {
        assertThat(Solution().lastSubstring("leetcode"), equalTo("tcode"))
    }
}
