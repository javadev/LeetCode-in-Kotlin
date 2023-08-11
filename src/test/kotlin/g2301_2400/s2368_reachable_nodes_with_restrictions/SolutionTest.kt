package g2301_2400.s2368_reachable_nodes_with_restrictions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reachableNodes() {
        assertThat(
            Solution()
                .reachableNodes(
                    7,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(3, 1),
                        intArrayOf(4, 0),
                        intArrayOf(0, 5),
                        intArrayOf(5, 6)
                    ),
                    intArrayOf(4, 5)
                ),
            equalTo(4)
        )
    }

    @Test
    fun reachableNodes2() {
        assertThat(
            Solution()
                .reachableNodes(
                    7,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(0, 5),
                        intArrayOf(0, 4),
                        intArrayOf(3, 2),
                        intArrayOf(6, 5)
                    ),
                    intArrayOf(4, 2, 1)
                ),
            equalTo(3)
        )
    }
}
