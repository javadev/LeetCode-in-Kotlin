package g1501_1600.s1563_stone_game_v

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameV() {
        assertThat(Solution().stoneGameV(intArrayOf(6, 2, 3, 4, 5, 5)), equalTo(18))
    }

    @Test
    fun stoneGameV2() {
        assertThat(Solution().stoneGameV(intArrayOf(7, 7, 7, 7, 7, 7, 7)), equalTo(28))
    }

    @Test
    fun stoneGameV3() {
        assertThat(Solution().stoneGameV(intArrayOf(4)), equalTo(0))
    }
}
