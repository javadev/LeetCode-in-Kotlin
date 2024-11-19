package g2601_2700.s2617_minimum_number_of_visited_cells_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumVisitedCells() {
        assertThat(
            Solution().minimumVisitedCells(
                arrayOf(
                    intArrayOf(3, 4, 2, 1),
                    intArrayOf(4, 2, 3, 1),
                    intArrayOf(2, 1, 0, 0),
                    intArrayOf(2, 4, 0, 0),
                ),
            ),
            equalTo(4),
        )
    }

    @Test
    fun minimumVisitedCells2() {
        assertThat(
            Solution().minimumVisitedCells(
                arrayOf(
                    intArrayOf(3, 4, 2, 1),
                    intArrayOf(4, 2, 1, 1),
                    intArrayOf(2, 1, 1, 0),
                    intArrayOf(3, 4, 1, 0),
                ),
            ),
            equalTo(3),
        )
    }

    @Test
    fun minimumVisitedCells3() {
        assertThat(
            Solution().minimumVisitedCells(arrayOf(intArrayOf(2, 1, 0), intArrayOf(1, 0, 0))),
            equalTo(-1),
        )
    }
}
