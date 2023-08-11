package g2601_2700.s2699_modify_graph_edge_weights

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun modifiedGraphEdges() {
        assertThat(
            Solution().modifiedGraphEdges(
                5,
                arrayOf(
                    intArrayOf(4, 1, -1),
                    intArrayOf(2, 0, -1), intArrayOf(0, 3, -1),
                    intArrayOf(4, 3, -1)
                ),
                0, 1, 5
            ),
            equalTo(arrayOf(intArrayOf(4, 1, 1), intArrayOf(2, 0, 1), intArrayOf(0, 3, 1), intArrayOf(4, 3, 3)))
        )
    }

    @Test
    fun modifiedGraphEdges2() {
        assertThat(
            Solution().modifiedGraphEdges(
                3,
                arrayOf(
                    intArrayOf(0, 1, -1),
                    intArrayOf(0, 2, 5)
                ),
                0, 2, 6
            ),
            equalTo(arrayOf())
        )
    }

    @Test
    fun modifiedGraphEdges3() {
        assertThat(
            Solution().modifiedGraphEdges(
                4,
                arrayOf(
                    intArrayOf(1, 0, 4),
                    intArrayOf(1, 2, 3), intArrayOf(2, 3, 5), intArrayOf(0, 3, -1)
                ),
                0, 2, 6
            ),
            equalTo(arrayOf(intArrayOf(1, 0, 4), intArrayOf(1, 2, 3), intArrayOf(2, 3, 5), intArrayOf(0, 3, 1)))
        )
    }
}
