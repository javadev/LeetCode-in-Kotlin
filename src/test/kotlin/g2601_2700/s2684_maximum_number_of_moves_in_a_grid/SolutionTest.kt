package g2601_2700.s2684_maximum_number_of_moves_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxMoves() {
        assertThat(
            Solution().maxMoves(
                arrayOf(
                    intArrayOf(2, 4, 3, 5),
                    intArrayOf(5, 4, 9, 3),
                    intArrayOf(3, 4, 2, 11),
                    intArrayOf(10, 9, 13, 15),
                ),
            ),
            equalTo(3),
        )
    }

    @Test
    fun maxMoves2() {
        assertThat(
            Solution().maxMoves(arrayOf(intArrayOf(3, 2, 4), intArrayOf(2, 1, 9), intArrayOf(1, 1, 7))),
            equalTo(0),
        )
    }
}
