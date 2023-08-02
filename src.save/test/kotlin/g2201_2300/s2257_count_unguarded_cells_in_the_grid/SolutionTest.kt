package g2201_2300.s2257_count_unguarded_cells_in_the_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countUnguarded() {
        assertThat(
            Solution()
                .countUnguarded(
                    4,
                    6,
                    arrayOf(intArrayOf(0, 0), intArrayOf(1, 1), intArrayOf(2, 3)),
                    arrayOf(intArrayOf(0, 1), intArrayOf(2, 2), intArrayOf(1, 4))
                ),
            equalTo(7)
        )
    }

    @Test
    fun countUnguarded2() {
        assertThat(
            Solution()
                .countUnguarded(
                    3,
                    3,
                    arrayOf(intArrayOf(1, 1)),
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(2, 1), intArrayOf(1, 2))
                ),
            equalTo(4)
        )
    }
}
