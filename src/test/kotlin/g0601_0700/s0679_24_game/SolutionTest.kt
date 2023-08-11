package g0601_0700.s0679_24_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun judgePoint24() {
        assertThat(Solution().judgePoint24(intArrayOf(4, 1, 8, 7)), equalTo(true))
    }

    @Test
    fun judgePoint242() {
        assertThat(Solution().judgePoint24(intArrayOf(1, 2, 1, 2)), equalTo(false))
    }
}
