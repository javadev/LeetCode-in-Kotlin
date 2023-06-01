package g0501_0600.s0557_reverse_words_in_a_string_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseWords() {
        assertThat(
            Solution().reverseWords("Let's take LeetCode contest"),
            equalTo("s'teL ekat edoCteeL tsetnoc")
        )
    }

    @Test
    fun reverseWords2() {
        assertThat(Solution().reverseWords("God Ding"), equalTo("doG gniD"))
    }
}
