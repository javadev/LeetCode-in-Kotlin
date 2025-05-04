package g3501_3600.s3537_fill_a_special_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun specialGrid() {
        assertThat<Array<IntArray>>(
            Solution().specialGrid(0),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(0))),
        )
    }

    @Test
    fun specialGrid2() {
        assertThat<Array<IntArray>>(
            Solution().specialGrid(1),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(3, 0), intArrayOf(2, 1))),
        )
    }

    @Test
    fun specialGrid3() {
        assertThat<Array<IntArray>>(
            Solution().specialGrid(2),
            equalTo<Array<IntArray>>(
                arrayOf<IntArray>(
                    intArrayOf(15, 12, 3, 0),
                    intArrayOf(14, 13, 2, 1),
                    intArrayOf(11, 8, 7, 4),
                    intArrayOf(10, 9, 6, 5),
                ),
            ),
        )
    }
}
