package g2701_2800.s2713_maximum_strictly_increasing_cells_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxIncreasingCells() {
        assertThat(
            Solution().maxIncreasingCells(arrayOf(intArrayOf(3, 1), intArrayOf(3, 4))),
            equalTo(2),
        )
    }

    @Test
    fun maxIncreasingCells2() {
        assertThat(
            Solution().maxIncreasingCells(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))),
            equalTo(1),
        )
    }

    @Test
    fun maxIncreasingCells3() {
        assertThat(
            Solution().maxIncreasingCells(arrayOf(intArrayOf(3, 1, 6), intArrayOf(-9, 5, 7))),
            equalTo(4),
        )
    }
}
