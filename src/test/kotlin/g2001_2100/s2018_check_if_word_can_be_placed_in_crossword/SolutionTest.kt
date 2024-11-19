package g2001_2100.s2018_check_if_word_can_be_placed_in_crossword

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun placeWordInCrossword() {
        assertThat(
            Solution()
                .placeWordInCrossword(
                    arrayOf(charArrayOf('#', ' ', '#'), charArrayOf(' ', ' ', '#'), charArrayOf('#', 'c', ' ')),
                    "abc",
                ),
            equalTo(true),
        )
    }

    @Test
    fun placeWordInCrossword2() {
        assertThat(
            Solution()
                .placeWordInCrossword(
                    arrayOf(charArrayOf(' ', '#', 'a'), charArrayOf(' ', '#', 'c'), charArrayOf(' ', '#', 'a')),
                    "ac",
                ),
            equalTo(false),
        )
    }

    @Test
    fun placeWordInCrossword3() {
        assertThat(
            Solution()
                .placeWordInCrossword(
                    arrayOf(charArrayOf('#', ' ', '#'), charArrayOf(' ', ' ', '#'), charArrayOf('#', ' ', 'c')),
                    "ca",
                ),
            equalTo(true),
        )
    }
}
