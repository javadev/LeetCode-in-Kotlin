package g2901_3000.s2974_minimum_number_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberGame() {
        assertThat(
            Solution().numberGame(intArrayOf(5, 4, 2, 3)),
            equalTo(intArrayOf(3, 2, 5, 4)),
        )
    }

    @Test
    fun numberGame2() {
        assertThat(Solution().numberGame(intArrayOf(2, 5)), equalTo(intArrayOf(5, 2)))
    }
}
