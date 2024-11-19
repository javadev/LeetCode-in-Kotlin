package g1801_1900.s1872_stone_game_viii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameVIII() {
        assertThat(Solution().stoneGameVIII(intArrayOf(-1, 2, -3, 4, -5)), equalTo(5))
    }

    @Test
    fun stoneGameVIII2() {
        assertThat(
            Solution().stoneGameVIII(intArrayOf(7, -6, 5, 10, 5, -2, -6)),
            equalTo(13),
        )
    }

    @Test
    fun stoneGameVIII3() {
        assertThat(Solution().stoneGameVIII(intArrayOf(-10, -12)), equalTo(-22))
    }
}
