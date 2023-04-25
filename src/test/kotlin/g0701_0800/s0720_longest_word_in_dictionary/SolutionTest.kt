package g0701_0800.s0720_longest_word_in_dictionary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestWord() {
        assertThat(
            Solution().longestWord(arrayOf("w", "wo", "wor", "worl", "world")),
            equalTo("world")
        )
    }

    @Test
    fun longestWord2() {
        assertThat(
            Solution()
                .longestWord(
                    arrayOf(
                        "a", "banana", "app", "appl", "ap", "apply", "apple"
                    )
                ),
            equalTo("apple")
        )
    }
}
