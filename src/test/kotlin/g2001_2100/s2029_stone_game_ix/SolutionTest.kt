package g2001_2100.s2029_stone_game_ix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameIX() {
        assertThat(Solution().stoneGameIX(intArrayOf(2, 1)), equalTo(true))
    }

    @Test
    fun stoneGameIX2() {
        assertThat(Solution().stoneGameIX(intArrayOf(2)), equalTo(false))
    }

    @Test
    fun stoneGameIX3() {
        assertThat(Solution().stoneGameIX(intArrayOf(5, 1, 2, 4, 3)), equalTo(false))
    }
}
