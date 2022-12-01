package g0001_0100.s0055_jump_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canJump() {
        assertThat(Solution().canJump(intArrayOf(2, 3, 1, 1, 4)), equalTo(true))
    }

    @Test
    fun canJump2() {
        assertThat(Solution().canJump(intArrayOf(3, 2, 1, 0, 4)), equalTo(false))
    }
}
