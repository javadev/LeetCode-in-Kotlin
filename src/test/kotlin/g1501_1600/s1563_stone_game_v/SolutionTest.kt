package g1501_1600.s1563_stone_game_v

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameV() {
        MatcherAssert.assertThat(Solution().stoneGameV(intArrayOf(6, 2, 3, 4, 5, 5)), CoreMatchers.equalTo(18))
    }

    @Test
    fun stoneGameV2() {
        MatcherAssert.assertThat(Solution().stoneGameV(intArrayOf(7, 7, 7, 7, 7, 7, 7)), CoreMatchers.equalTo(28))
    }

    @Test
    fun stoneGameV3() {
        MatcherAssert.assertThat(Solution().stoneGameV(intArrayOf(4)), CoreMatchers.equalTo(0))
    }
}
