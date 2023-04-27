package g0901_1000.s0934_shortest_bridge

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestBridge() {
        assertThat(Solution().shortestBridge(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))), equalTo(1))
    }

    @Test
    fun shortestBridge2() {
        assertThat(
            Solution().shortestBridge(arrayOf(intArrayOf(0, 1, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 1))),
            equalTo(2)
        )
    }

    @Test
    fun shortestBridge3() {
        assertThat(
            Solution()
                .shortestBridge(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1, 1),
                        intArrayOf(1, 0, 0, 0, 1),
                        intArrayOf(1, 0, 1, 0, 1),
                        intArrayOf(1, 0, 0, 0, 1),
                        intArrayOf(1, 1, 1, 1, 1)
                    )
                ),
            equalTo(1)
        )
    }
}
