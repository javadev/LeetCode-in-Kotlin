package g0101_0200.s0139_word_break

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wordBreak() {
        assertThat(Solution().wordBreak("leetcode", listOf("leet", "code")), equalTo(true))
    }

    @Test
    fun wordBreak2() {
        assertThat(Solution().wordBreak("applepenapple", listOf("apple", "pen")), equalTo(true))
    }

    @Test
    fun wordBreak3() {
        assertThat(Solution().wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat")), equalTo(false))
    }
}
