package g2001_2100.s2047_number_of_valid_words_in_a_sentence

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countValidWords() {
        MatcherAssert.assertThat(Solution().countValidWords("cat and  dog"), CoreMatchers.equalTo(3))
    }

    @Test
    fun countValidWords2() {
        MatcherAssert.assertThat(Solution().countValidWords("!this  1-s b8d!"), CoreMatchers.equalTo(0))
    }

    @Test
    fun countValidWords3() {
        MatcherAssert.assertThat(
            Solution().countValidWords("alice and  bob are playing stone-game10"),
            CoreMatchers.equalTo(5)
        )
    }
}
