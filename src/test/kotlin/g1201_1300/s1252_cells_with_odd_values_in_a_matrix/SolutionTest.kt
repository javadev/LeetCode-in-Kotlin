package g1201_1300.s1252_cells_with_odd_values_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun oddCells() {
        assertThat(
            Solution().oddCells(
                2, 3,
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 1)
                )
            ),
            equalTo(6)
        )
    }

    @Test
    fun oddCells2() {
        assertThat(
            Solution().oddCells(
                2, 2,
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(0, 0)
                )
            ),
            equalTo(0)
        )
    }
}
