package g0501_0600.s0524_longest_word_in_dictionary_through_deleting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLongestWord() {
        assertThat(
            Solution()
                .findLongestWord(
                    "abpcplea", listOf("ale", "apple", "monkey", "plea")
                ),
            equalTo("apple")
        )
    }

    @Test
    fun findLongestWord2() {
        assertThat(
            Solution().findLongestWord("abpcplea", listOf("a", "b", "c")),
            equalTo("a")
        )
    }
}
