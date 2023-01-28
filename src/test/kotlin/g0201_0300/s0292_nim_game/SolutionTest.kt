package g0201_0300.s0292_nim_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canWinNim() {
        assertThat(Solution().canWinNim(4), equalTo(false))
    }

    @Test
    fun canWinNim2() {
        assertThat(Solution().canWinNim(1), equalTo(true))
    }

    @Test
    fun canWinNim3() {
        assertThat(Solution().canWinNim(2), equalTo(true))
    }
}
