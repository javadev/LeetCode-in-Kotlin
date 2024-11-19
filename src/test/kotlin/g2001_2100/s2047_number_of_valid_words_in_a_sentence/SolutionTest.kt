package g2001_2100.s2047_number_of_valid_words_in_a_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countValidWords() {
        assertThat(Solution().countValidWords("cat and  dog"), equalTo(3))
    }

    @Test
    fun countValidWords2() {
        assertThat(Solution().countValidWords("!this  1-s b8d!"), equalTo(0))
    }

    @Test
    fun countValidWords3() {
        assertThat(
            Solution().countValidWords("alice and  bob are playing stone-game10"),
            equalTo(5),
        )
    }
}
