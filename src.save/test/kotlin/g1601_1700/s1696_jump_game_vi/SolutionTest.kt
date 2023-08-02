package g1601_1700.s1696_jump_game_vi

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxResult() {
        assertThat(Solution().maxResult(intArrayOf(1, -1, -2, 4, -7, 3), 2), equalTo(7))
    }

    @Test
    fun maxResult2() {
        assertThat(Solution().maxResult(intArrayOf(10, -5, -2, 4, 0, 3), 3), equalTo(17))
    }

    @Test
    fun maxResult3() {
        assertThat(
            Solution().maxResult(intArrayOf(1, -5, -20, 4, -1, 3, -6, -3), 2), equalTo(0)
        )
    }
}
