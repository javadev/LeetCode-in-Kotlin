package g1401_1500.s1406_stone_game_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGameIII() {
        assertThat(Solution().stoneGameIII(intArrayOf(1, 2, 3, 7)), equalTo("Bob"))
    }

    @Test
    fun stoneGameIII2() {
        assertThat(Solution().stoneGameIII(intArrayOf(1, 2, 3, -9)), equalTo("Alice"))
    }

    @Test
    fun stoneGameIII3() {
        assertThat(Solution().stoneGameIII(intArrayOf(1, 2, 3, 6)), equalTo("Tie"))
    }
}
