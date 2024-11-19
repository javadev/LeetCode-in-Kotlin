package g0201_0300.s0212_word_search_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findWords() {
        val board = arrayOf(
            charArrayOf('o', 'a', 'a', 'n'),
            charArrayOf('e', 't', 'a', 'e'),
            charArrayOf('i', 'h', 'k', 'r'),
            charArrayOf('i', 'f', 'l', 'v'),
        )
        val words = arrayOf<String?>("oath", "pea", "eat", "rain")
        val expected: MutableList<String> = ArrayList()
        expected.add("oath")
        expected.add("eat")
        assertThat(Solution().findWords(board, words), equalTo(expected))
    }

    @Test
    fun findWords2() {
        val board = arrayOf(charArrayOf('a', 'b'), charArrayOf('c', 'd'))
        val words = arrayOf<String?>("abcb")
        assertThat(Solution().findWords(board, words), equalTo(emptyList()))
    }
}
