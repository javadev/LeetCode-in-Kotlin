package g3901_4000.s3905_multi_source_flood_fill

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun colorGrid() {
        assertThat<Array<IntArray>>(
            Solution().colorGrid(3, 3, arrayOf<IntArray>(intArrayOf(0, 0, 1), intArrayOf(2, 2, 2))),
            equalTo<Array<IntArray>>(
                arrayOf<IntArray>(
                    intArrayOf(1, 1, 2),
                    intArrayOf(1, 2, 2),
                    intArrayOf(2, 2, 2),
                ),
            ),
        )
    }

    @Test
    fun colorGrid2() {
        assertThat<Array<IntArray>>(
            Solution().colorGrid(3, 3, arrayOf<IntArray>(intArrayOf(0, 1, 3), intArrayOf(1, 1, 5))),
            equalTo<Array<IntArray>>(
                arrayOf<IntArray>(
                    intArrayOf(3, 3, 3),
                    intArrayOf(5, 5, 5),
                    intArrayOf(5, 5, 5),
                ),
            ),
        )
    }

    @Test
    fun colorGrid3() {
        assertThat<Array<IntArray>>(
            Solution().colorGrid(2, 2, arrayOf<IntArray>(intArrayOf(1, 1, 5))),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(5, 5), intArrayOf(5, 5))),
        )
    }

    @Test
    fun colorGrid4() {
        assertThat<Array<IntArray>>(
            Solution().colorGrid(1, 1, arrayOf<IntArray>(intArrayOf(0, 0, 7))),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(7))),
        )
    }

    @Test
    fun colorGrid5() {
        assertThat<Array<IntArray>>(
            Solution().colorGrid(1, 5, arrayOf<IntArray>(intArrayOf(0, 0, 2), intArrayOf(0, 4, 9))),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(2, 2, 9, 9, 9))),
        )
    }

    @Test
    fun colorGrid6() {
        assertThat<Array<IntArray>>(
            Solution().colorGrid(5, 1, arrayOf<IntArray>(intArrayOf(4, 0, 9), intArrayOf(0, 0, 2))),
            equalTo<Array<IntArray>>(
                arrayOf<IntArray>(
                    intArrayOf(2),
                    intArrayOf(2),
                    intArrayOf(9),
                    intArrayOf(9),
                    intArrayOf(9),
                ),
            ),
        )
    }
}
