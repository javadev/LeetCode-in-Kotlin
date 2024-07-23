package g3201_3300.s3227_vowels_game_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun doesAliceWin() {
        assertThat(Solution().doesAliceWin("leetcoder"), equalTo(true))
    }

    @Test
    fun doesAliceWin2() {
        assertThat(Solution().doesAliceWin("bbcd"), equalTo(false))
    }
}
