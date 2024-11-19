package g1601_1700.s1686_stone_game_vi

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameVI() {
        assertThat(Solution().stoneGameVI(intArrayOf(1, 3), intArrayOf(2, 1)), equalTo(1))
    }

    @Test
    fun stoneGameVI2() {
        assertThat(Solution().stoneGameVI(intArrayOf(1, 2), intArrayOf(3, 1)), equalTo(0))
    }

    @Test
    fun stoneGameVI3() {
        assertThat(
            Solution().stoneGameVI(intArrayOf(2, 4, 3), intArrayOf(1, 6, 7)),
            equalTo(-1),
        )
    }
}
