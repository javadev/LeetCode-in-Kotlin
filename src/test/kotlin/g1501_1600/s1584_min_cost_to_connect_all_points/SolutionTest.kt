package g1501_1600.s1584_min_cost_to_connect_all_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCostConnectPoints() {
        assertThat(
            Solution()
                .minCostConnectPoints(
                    arrayOf(
                        intArrayOf(0, 0),
                        intArrayOf(2, 2),
                        intArrayOf(3, 10),
                        intArrayOf(5, 2),
                        intArrayOf(7, 0)
                    )
                ),
            equalTo(20)
        )
    }

    @Test
    fun minCostConnectPoints2() {
        assertThat(
            Solution().minCostConnectPoints(arrayOf(intArrayOf(3, 12), intArrayOf(-2, 5), intArrayOf(-4, 1))),
            equalTo(18)
        )
    }
}
