package g0101_0200.s0140_word_break_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wordBreak() {
        val wordDict = listOf("cat", "cats", "and", "sand", "dog")
        assertThat(
            Solution().wordBreak("catsanddog", wordDict),
            equalTo(listOf("cat sand dog", "cats and dog"))
        )
    }

    @Test
    fun wordBreak2() {
        val wordDict = listOf("apple", "pen", "applepen", "pine", "pineapple")
        assertThat(
            Solution().wordBreak("pineapplepenapple", wordDict),
            equalTo(
                listOf(
                    "pine apple pen apple",
                    "pine applepen apple",
                    "pineapple pen apple"
                )
            )
        )
    }

    @Test
    fun wordBreak3() {
        val wordDict = listOf("cats", "dog", "sand", "and", "cat")
        assertThat(
            Solution().wordBreak("catsandog", wordDict), equalTo(emptyList())
        )
    }
}
