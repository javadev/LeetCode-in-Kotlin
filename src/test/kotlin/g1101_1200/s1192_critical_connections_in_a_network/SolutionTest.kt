package g1101_1200.s1192_critical_connections_in_a_network

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun criticalConnections() {
        assertThat(
            Solution()
                .criticalConnections(
                    4,
                    getLists(arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0), intArrayOf(1, 3))),
                ),
            equalTo(getLists(arrayOf(intArrayOf(3, 1)))),
        )
    }

    @Test
    fun criticalConnections2() {
        assertThat(
            Solution().criticalConnections(2, getLists(arrayOf(intArrayOf(0, 1)))),
            equalTo(getLists(arrayOf(intArrayOf(1, 0)))),
        )
    }
}
