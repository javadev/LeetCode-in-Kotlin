package g1301_1400.s1306_jump_game_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canReach() {
        assertThat(Solution().canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 5), equalTo(true))
    }

    @Test
    fun canReach2() {
        assertThat(Solution().canReach(intArrayOf(4, 2, 3, 0, 3, 1, 2), 0), equalTo(true))
    }

    @Test
    fun canReach3() {
        assertThat(Solution().canReach(intArrayOf(3, 0, 2, 1, 2), 2), equalTo(false))
    }
}
