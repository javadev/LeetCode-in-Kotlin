package g0801_0900.s0882_reachable_nodes_in_subdivided_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reachableNodes() {
        assertThat(
            Solution().reachableNodes(arrayOf(intArrayOf(0, 1, 10), intArrayOf(0, 2, 1), intArrayOf(1, 2, 2)), 6, 3),
            equalTo(13),
        )
    }

    @Test
    fun reachableNodes2() {
        assertThat(
            Solution()
                .reachableNodes(
                    arrayOf(
                        intArrayOf(0, 1, 4),
                        intArrayOf(1, 2, 6),
                        intArrayOf(0, 2, 8),
                        intArrayOf(1, 3, 1),
                    ),
                    10,
                    4,
                ),
            equalTo(23),
        )
    }

    @Test
    fun reachableNodes3() {
        assertThat(
            Solution()
                .reachableNodes(
                    arrayOf(
                        intArrayOf(1, 2, 4),
                        intArrayOf(1, 4, 5),
                        intArrayOf(1, 3, 1),
                        intArrayOf(2, 3, 4),
                        intArrayOf(3, 4, 5),
                    ),
                    17,
                    5,
                ),
            equalTo(1),
        )
    }
}
