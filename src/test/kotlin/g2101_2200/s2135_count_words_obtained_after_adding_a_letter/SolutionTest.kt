package g2101_2200.s2135_count_words_obtained_after_adding_a_letter

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wordCount() {
        assertThat(
            Solution()
                .wordCount(arrayOf("ant", "act", "tack"), arrayOf("tack", "act", "acti")),
            equalTo(2),
        )
    }

    @Test
    fun wordCount2() {
        assertThat(
            Solution().wordCount(arrayOf("ab", "a"), arrayOf("abc", "abcd")),
            equalTo(1),
        )
    }
}
