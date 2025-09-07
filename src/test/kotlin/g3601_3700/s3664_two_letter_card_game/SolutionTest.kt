package g3601_3700.s3664_two_letter_card_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun score() {
        assertThat<Int>(
            Solution().score(arrayOf<String>("aa", "ab", "ba", "ac"), 'a'),
            equalTo<Int>(2),
        )
    }

    @Test
    fun score2() {
        assertThat<Int>(
            Solution().score(arrayOf<String>("aa", "ab", "ba"), 'a'),
            equalTo<Int>(1),
        )
    }

    @Test
    fun score3() {
        assertThat<Int>(
            Solution().score(arrayOf<String>("aa", "ab", "ba", "ac"), 'b'),
            equalTo<Int>(0),
        )
    }
}
