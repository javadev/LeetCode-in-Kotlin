package g2001_2100.s2018_check_if_word_can_be_placed_in_crossword

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun placeWordInCrossword() {
        MatcherAssert.assertThat(
            Solution()
                .placeWordInCrossword(
                    arrayOf(charArrayOf('#', ' ', '#'), charArrayOf(' ', ' ', '#'), charArrayOf('#', 'c', ' ')),
                    "abc"
                ),
            CoreMatchers.equalTo(true)
        )
    }

    @Test
    fun placeWordInCrossword2() {
        MatcherAssert.assertThat(
            Solution()
                .placeWordInCrossword(
                    arrayOf(charArrayOf(' ', '#', 'a'), charArrayOf(' ', '#', 'c'), charArrayOf(' ', '#', 'a')),
                    "ac"
                ),
            CoreMatchers.equalTo(false)
        )
    }

    @Test
    fun placeWordInCrossword3() {
        MatcherAssert.assertThat(
            Solution()
                .placeWordInCrossword(
                    arrayOf(charArrayOf('#', ' ', '#'), charArrayOf(' ', ' ', '#'), charArrayOf('#', ' ', 'c')),
                    "ca"
                ),
            CoreMatchers.equalTo(true)
        )
    }
}
