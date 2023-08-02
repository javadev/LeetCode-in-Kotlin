package g1801_1900.s1880_check_if_word_equals_summation_of_two_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSumEqual() {
        assertThat(Solution().isSumEqual("acb", "cba", "cdb"), equalTo(true))
    }

    @Test
    fun isSumEqual2() {
        assertThat(Solution().isSumEqual("aaa", "a", "aab"), equalTo(false))
    }

    @Test
    fun isSumEqual3() {
        assertThat(Solution().isSumEqual("aaa", "a", "aaaa"), equalTo(true))
    }
}
