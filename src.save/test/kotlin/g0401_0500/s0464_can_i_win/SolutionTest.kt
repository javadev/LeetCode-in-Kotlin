package g0401_0500.s0464_can_i_win

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canIWin() {
        assertThat(Solution().canIWin(10, 0), equalTo(true))
    }

    @Test
    fun canIWin2() {
        assertThat(Solution().canIWin(10, 1), equalTo(true))
    }

    @Test
    fun canIWin3() {
        assertThat(Solution().canIWin(10, 11), equalTo(false))
    }
}
