package g2901_3000.s2942_find_words_containing_character

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findWordsContaining() {
        assertThat(
            Solution().findWordsContaining(arrayOf("leet", "code"), 'e'),
            equalTo(mutableListOf(0, 1))
        )
    }

    @Test
    fun findWordsContaining2() {
        assertThat(
            Solution().findWordsContaining(arrayOf("abc", "bcd", "aaaa", "cbc"), 'a'),
            equalTo(mutableListOf(0, 2))
        )
    }

    @Test
    fun findWordsContaining3() {
        assertThat(
            Solution().findWordsContaining(arrayOf("abc", "bcd", "aaaa", "cbc"), 'z'),
            equalTo(mutableListOf<Any>())
        )
    }
}
