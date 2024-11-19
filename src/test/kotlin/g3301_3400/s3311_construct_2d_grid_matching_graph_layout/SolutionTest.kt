package g3301_3400.s3311_construct_2d_grid_matching_graph_layout

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructGridLayout() {
        assertThat<Array<IntArray>>(
            Solution().constructGridLayout(
                4,
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(2, 3)),
            ),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(1, 3))),
        )
    }

    @Test
    fun constructGridLayout2() {
        assertThat<Array<IntArray>>(
            Solution().constructGridLayout(
                5,
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(2, 4)),
            ),
            equalTo<Array<IntArray>>(arrayOf<IntArray>(intArrayOf(0, 1, 3, 2, 4))),
        )
    }

    @Test
    fun constructGridLayout3() {
        assertThat<Array<IntArray>>(
            Solution()
                .constructGridLayout(
                    9,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1),
                        intArrayOf(0, 4),
                        intArrayOf(0, 5),
                        intArrayOf(1, 7),
                        intArrayOf(2, 3),
                        intArrayOf(2, 4),
                        intArrayOf(2, 5),
                        intArrayOf(3, 6),
                        intArrayOf(4, 6),
                        intArrayOf(4, 7),
                        intArrayOf(6, 8),
                        intArrayOf(7, 8),
                    ),
                ),
            equalTo<Array<IntArray>>(
                arrayOf<IntArray>(
                    intArrayOf(1, 0, 5),
                    intArrayOf(7, 4, 2),
                    intArrayOf(8, 6, 3),
                ),
            ),
        )
    }
}
