package g0101_0200.s0151_reverse_words_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseWords() {
        assertThat(Solution().reverseWords("the sky is blue"), equalTo("blue is sky the"))
    }

    @Test
    fun reverseWords2() {
        assertThat(Solution().reverseWords("  hello world  "), equalTo("world hello"))
    }

    @Test
    fun reverseWords3() {
        assertThat(Solution().reverseWords("a good   example"), equalTo("example good a"))
    }
}
