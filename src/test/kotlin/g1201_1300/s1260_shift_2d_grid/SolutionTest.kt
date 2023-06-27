package g1201_1300.s1260_shift_2d_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shiftGrid() {
        assertThat(
            Solution().shiftGrid(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 1),
            equalTo(
                listOf(mutableListOf(9, 1, 2), mutableListOf(3, 4, 5), mutableListOf(6, 7, 8))
            )
        )
    }

    @Test
    fun shiftGrid2() {
        assertThat(
            Solution()
                .shiftGrid(
                    arrayOf(
                        intArrayOf(3, 8, 1, 9), intArrayOf(19, 7, 2, 5),
                        intArrayOf(4, 6, 11, 10), intArrayOf(12, 0, 21, 13)
                    ),
                    4
                ),
            equalTo(
                listOf(
                    mutableListOf(12, 0, 21, 13), mutableListOf(3, 8, 1, 9),
                    mutableListOf(19, 7, 2, 5), mutableListOf(4, 6, 11, 10)
                )
            )
        )
    }

    @Test
    fun shiftGrid3() {
        assertThat(
            Solution().shiftGrid(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 9),
            equalTo(
                listOf(mutableListOf(1, 2, 3), mutableListOf(4, 5, 6), mutableListOf(7, 8, 9))
            )
        )
    }
}
