package g0801_0900.s0847_shortest_path_visiting_all_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestPathLength() {
        assertThat(
            Solution().shortestPathLength(arrayOf(intArrayOf(1, 2, 3), intArrayOf(0), intArrayOf(0), intArrayOf(0))),
            equalTo(4)
        )
    }

    @Test
    fun shortestPathLength2() {
        assertThat(
            Solution()
                .shortestPathLength(
                    arrayOf(
                        intArrayOf(1),
                        intArrayOf(0, 2, 3),
                        intArrayOf(1, 3, 4),
                        intArrayOf(2),
                        intArrayOf(1, 2)
                    )
                ),
            equalTo(4)
        )
    }
}
