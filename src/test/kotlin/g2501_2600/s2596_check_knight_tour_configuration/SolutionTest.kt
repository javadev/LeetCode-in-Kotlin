package g2501_2600.s2596_check_knight_tour_configuration

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkValidGrid() {
        assertThat(
            Solution().checkValidGrid(
                arrayOf(
                    intArrayOf(0, 11, 16, 5, 20),
                    intArrayOf(17, 4, 19, 10, 15),
                    intArrayOf(12, 1, 8, 21, 6),
                    intArrayOf(3, 18, 23, 14, 9),
                    intArrayOf(24, 13, 2, 7, 22),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun checkValidGrid2() {
        assertThat(
            Solution().checkValidGrid(
                arrayOf(
                    intArrayOf(0, 3, 6),
                    intArrayOf(5, 8, 1),
                    intArrayOf(2, 7, 4),
                ),
            ),
            equalTo(false),
        )
    }
}
