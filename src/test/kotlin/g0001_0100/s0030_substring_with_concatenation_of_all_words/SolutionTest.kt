package g0001_0100.s0030_substring_with_concatenation_of_all_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays
import java.util.Collections

internal class SolutionTest {
    @Test
    fun findSubstring() {
        assertThat(
            Solution().findSubstring("barfoothefoobarman", arrayOf("foo", "bar")),
            equalTo(Arrays.asList(0, 9))
        )
    }

    @Test
    fun findSubstring2() {
        assertThat(
            Solution()
                .findSubstring(
                    "wordgoodgoodgoodbestword", arrayOf("word", "good", "best", "word")
                ),
            equalTo(Collections.emptyList())
        )
    }

    @Test
    fun findSubstring3() {
        assertThat(
            Solution()
                .findSubstring(
                    "barfoofoobarthefoobarman", arrayOf("bar", "foo", "the")
                ),
            equalTo(Arrays.asList(6, 9, 12))
        )
    }
}
