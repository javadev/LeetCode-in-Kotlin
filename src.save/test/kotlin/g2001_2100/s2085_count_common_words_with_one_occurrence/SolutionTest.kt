package g2001_2100.s2085_count_common_words_with_one_occurrence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countWords() {
        assertThat(
            Solution()
                .countWords(arrayOf("leetcode", "is", "amazing", "as", "is"), arrayOf("amazing", "leetcode", "is")),
            equalTo(2)
        )
    }

    @Test
    fun countWords2() {
        assertThat(
            Solution()
                .countWords(arrayOf("b", "bb", "bbb"), arrayOf("a", "aa", "aaa")),
            equalTo(0)
        )
    }

    @Test
    fun countWords3() {
        assertThat(
            Solution()
                .countWords(arrayOf("a", "ab"), arrayOf("a", "a", "a", "ab")),
            equalTo(1)
        )
    }
}
