package g2201_2300.s2293_min_max_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMaxGame() {
        assertThat(Solution().minMaxGame(intArrayOf(1, 3, 5, 2, 4, 8, 2, 2)), equalTo(1))
    }

    @Test
    fun minMaxGame2() {
        assertThat(Solution().minMaxGame(intArrayOf(3)), equalTo(3))
    }
}
