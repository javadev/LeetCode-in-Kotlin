package g1901_2000.s1914_cyclically_rotating_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotateGrid() {
        assertThat(
            Solution().rotateGrid(arrayOf(intArrayOf(40, 10), intArrayOf(30, 20)), 1),
            equalTo(arrayOf(intArrayOf(10, 20), intArrayOf(40, 30)))
        )
    }

    @Test
    fun rotateGrid2() {
        assertThat(
            Solution()
                .rotateGrid(
                    arrayOf(
                        intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8),
                        intArrayOf(9, 10, 11, 12), intArrayOf(13, 14, 15, 16)
                    ),
                    2
                ),
            equalTo(
                arrayOf(
                    intArrayOf(3, 4, 8, 12), intArrayOf(2, 11, 10, 16),
                    intArrayOf(1, 7, 6, 15), intArrayOf(5, 9, 13, 14)
                )
            )
        )
    }
}
