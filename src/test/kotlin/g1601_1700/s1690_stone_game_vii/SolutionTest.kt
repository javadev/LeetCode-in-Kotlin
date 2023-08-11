package g1601_1700.s1690_stone_game_vii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameVII() {
        assertThat(Solution().stoneGameVII(intArrayOf(5, 3, 1, 4, 2)), equalTo(6))
    }

    @Test
    fun stoneGameVII2() {
        assertThat(
            Solution().stoneGameVII(intArrayOf(7, 90, 5, 1, 100, 10, 10, 2)), equalTo(122)
        )
    }
}
