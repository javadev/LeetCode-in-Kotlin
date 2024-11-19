package g2101_2200.s2114_maximum_number_of_words_found_in_sentences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostWordsFound() {
        assertThat(
            Solution()
                .mostWordsFound(
                    arrayOf(
                        "alice and bob love leetcode",
                        "i think so too",
                        "this is great thanks very much",
                    ),
                ),
            equalTo(6),
        )
    }

    @Test
    fun mostWordsFound2() {
        assertThat(
            Solution()
                .mostWordsFound(
                    arrayOf(
                        "please wait",
                        "continue to fight",
                        "continue to win",
                    ),
                ),
            equalTo(3),
        )
    }
}
