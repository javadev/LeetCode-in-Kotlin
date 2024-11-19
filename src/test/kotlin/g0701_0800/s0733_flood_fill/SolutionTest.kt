package g0701_0800.s0733_flood_fill

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun floodFill() {
        assertThat(
            Solution().floodFill(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)), 1, 1, 2),
            equalTo(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1))),
        )
    }

    @Test
    fun floodFill2() {
        assertThat(
            Solution().floodFill(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)), 1, 1, 2),
            equalTo(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 2))),
        )
    }
}
