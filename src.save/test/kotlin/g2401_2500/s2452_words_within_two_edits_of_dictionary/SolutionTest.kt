package g2401_2500.s2452_words_within_two_edits_of_dictionary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun twoEditWords() {
        assertThat(
            Solution()
                .twoEditWords(arrayOf("word", "note", "ants", "wood"), arrayOf("wood", "joke", "moat")),
            equalTo(mutableListOf("word", "note", "wood"))
        )
    }

    @Test
    fun twoEditWords2() {
        assertThat(
            Solution().twoEditWords(arrayOf("yes"), arrayOf("not")),
            equalTo(emptyList<Any>())
        )
    }
}
