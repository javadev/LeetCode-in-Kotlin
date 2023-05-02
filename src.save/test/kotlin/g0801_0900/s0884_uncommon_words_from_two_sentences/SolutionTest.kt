package g0801_0900.s0884_uncommon_words_from_two_sentences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uncommonFromSentences() {
        assertThat(
            Solution().uncommonFromSentences("this apple is sweet", "this apple is sour"),
            equalTo(arrayOf("sweet", "sour"))
        )
    }

    @Test
    fun uncommonFromSentences2() {
        assertThat(
            Solution().uncommonFromSentences("apple apple", "banana"),
            equalTo(arrayOf("banana"))
        )
    }
}
