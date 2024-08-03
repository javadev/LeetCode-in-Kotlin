package g3201_3300.s3232_find_if_digit_game_can_be_won

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canAliceWin() {
        assertThat(Solution().canAliceWin(intArrayOf(1, 2, 3, 4, 10)), equalTo(false))
    }

    @Test
    fun canAliceWin2() {
        assertThat(Solution().canAliceWin(intArrayOf(1, 2, 3, 4, 5, 14)), equalTo(true))
    }

    @Test
    fun canAliceWin3() {
        assertThat(Solution().canAliceWin(intArrayOf(5, 5, 5, 25)), equalTo(true))
    }
}
