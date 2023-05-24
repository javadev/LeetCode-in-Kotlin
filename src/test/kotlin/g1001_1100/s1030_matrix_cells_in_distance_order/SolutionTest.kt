package g1001_1100.s1030_matrix_cells_in_distance_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun allCellsDistOrder() {
        assertThat(
            Solution().allCellsDistOrder(1, 2, 0, 0),
            equalTo(arrayOf(intArrayOf(0, 0), intArrayOf(0, 1)))
        )
    }

    @Test
    fun allCellsDistOrder2() {
        assertThat(
            Solution().allCellsDistOrder(2, 2, 0, 1),
            equalTo(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(1, 0)))
        )
    }

    @Test
    fun allCellsDistOrder3() {
        assertThat(
            Solution().allCellsDistOrder(2, 3, 1, 2),
            equalTo(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(0, 2),
                    intArrayOf(1, 1),
                    intArrayOf(0, 1),
                    intArrayOf(1, 0),
                    intArrayOf(0, 0)
                )
            )
        )
    }
}
