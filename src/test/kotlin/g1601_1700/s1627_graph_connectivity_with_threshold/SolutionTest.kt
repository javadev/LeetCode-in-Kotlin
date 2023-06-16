package g1601_1700.s1627_graph_connectivity_with_threshold

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areConnected() {
        assertThat(
            Solution().areConnected(6, 2, arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6))),
            equalTo(listOf(false, false, true))
        )
    }

    @Test
    fun areConnected2() {
        assertThat(
            Solution()
                .areConnected(
                    6,
                    0,
                    arrayOf(intArrayOf(4, 5), intArrayOf(3, 4), intArrayOf(3, 2), intArrayOf(2, 6), intArrayOf(1, 3))
                ),
            equalTo(listOf(true, true, true, true, true))
        )
    }

    @Test
    fun areConnected3() {
        assertThat(
            Solution()
                .areConnected(
                    5,
                    1,
                    arrayOf(intArrayOf(4, 5), intArrayOf(4, 5), intArrayOf(3, 2), intArrayOf(2, 3), intArrayOf(3, 4))
                ),
            equalTo(listOf(false, false, false, false, false))
        )
    }
}
