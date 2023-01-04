package g0001_0100.s0045_jump_game_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun jump() {
        assertThat(Solution().jump(intArrayOf(2, 3, 1, 1, 4)), equalTo(2))
    }

    @Test
    fun jump2() {
        assertThat(Solution().jump(intArrayOf(2, 3, 0, 1, 4)), equalTo(2))
    }
}
