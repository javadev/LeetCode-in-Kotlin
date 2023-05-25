package g1101_1200.s1163_last_substring_in_lexicographical_order

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastSubstring() {
        MatcherAssert.assertThat(Solution().lastSubstring("abab"), CoreMatchers.equalTo("bab"))
    }

    @Test
    fun lastSubstring2() {
        MatcherAssert.assertThat(Solution().lastSubstring("leetcode"), CoreMatchers.equalTo("tcode"))
    }
}
