package g1101_1200.s1140_stone_game_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameII() {
        MatcherAssert.assertThat(Solution().stoneGameII(intArrayOf(2, 7, 9, 4, 4)), CoreMatchers.equalTo(10))
    }

    @Test
    fun stoneGameII2() {
        MatcherAssert.assertThat(Solution().stoneGameII(intArrayOf(1, 2, 3, 4, 5, 100)), CoreMatchers.equalTo(104))
    }
}