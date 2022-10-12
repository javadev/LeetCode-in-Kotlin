package g0101_0200.s0174_dungeon_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dungeonGame() {
        val input = arrayOf(intArrayOf(-2, -3, 3), intArrayOf(-5, -10, 1), intArrayOf(10, 30, -5))
        assertThat(Solution().calculateMinimumHP(input), equalTo(7))
    }

    @Test
    fun dungeonGame2() {
        val input = arrayOf(intArrayOf(0))
        assertThat(Solution().calculateMinimumHP(input), equalTo(1))
    }
}
