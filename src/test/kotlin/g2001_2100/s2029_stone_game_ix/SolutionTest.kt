package g2001_2100.s2029_stone_game_ix

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameIX() {
        MatcherAssert.assertThat(Solution().stoneGameIX(intArrayOf(2, 1)), CoreMatchers.equalTo(true))
    }

    @Test
    fun stoneGameIX2() {
        MatcherAssert.assertThat(Solution().stoneGameIX(intArrayOf(2)), CoreMatchers.equalTo(false))
    }

    @Test
    fun stoneGameIX3() {
        MatcherAssert.assertThat(Solution().stoneGameIX(intArrayOf(5, 1, 2, 4, 3)), CoreMatchers.equalTo(false))
    }
}
