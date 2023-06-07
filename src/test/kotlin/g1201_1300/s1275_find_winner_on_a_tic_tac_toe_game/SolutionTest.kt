package g1201_1300.s1275_find_winner_on_a_tic_tac_toe_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun tictactoe() {
        assertThat(
            Solution().tictactoe(
                arrayOf(
                    intArrayOf(0, 0), intArrayOf(2, 0),
                    intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2)
                )
            ),
            equalTo("A")
        )
    }

    @Test
    fun tictactoe2() {
        assertThat(
            Solution()
                .tictactoe(
                    arrayOf(
                        intArrayOf(0, 0), intArrayOf(1, 1),
                        intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 0), intArrayOf(2, 0)
                    )
                ),
            equalTo("B")
        )
    }

    @Test
    fun tictactoe3() {
        assertThat(
            Solution()
                .tictactoe(
                    arrayOf(
                        intArrayOf(0, 0), intArrayOf(1, 1),
                        intArrayOf(2, 0), intArrayOf(1, 0), intArrayOf(1, 2), intArrayOf(2, 1),
                        intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 2)
                    )
                ),
            equalTo("Draw")
        )
    }
}
