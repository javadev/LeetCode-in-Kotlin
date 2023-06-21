package g1801_1900.s1880_check_if_word_equals_summation_of_two_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isSumEqual: Unit
        get() {
            assertThat(Solution().isSumEqual("acb", "cba", "cdb"), equalTo(true))
        }

    @get:Test
    val isSumEqual2: Unit
        get() {
            assertThat(Solution().isSumEqual("aaa", "a", "aab"), equalTo(false))
        }

    @get:Test
    val isSumEqual3: Unit
        get() {
            assertThat(Solution().isSumEqual("aaa", "a", "aaaa"), equalTo(true))
        }
}
