package g1301_1400.s1340_jump_game_v

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxJumps() {
        assertThat(
            Solution().maxJumps(intArrayOf(6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12), 2),
            equalTo(4)
        )
    }

    @Test
    fun maxJumps2() {
        assertThat(Solution().maxJumps(intArrayOf(3, 3, 3, 3, 3), 3), equalTo(1))
    }

    @Test
    fun maxJumps3() {
        assertThat(Solution().maxJumps(intArrayOf(7, 6, 5, 4, 3, 2, 1), 1), equalTo(7))
    }
}
