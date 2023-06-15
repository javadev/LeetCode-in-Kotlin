package g1601_1700.s1615_maximal_network_rank

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximalNetworkRank() {
        assertThat(
            Solution().maximalNetworkRank(
                4,
                arrayOf(intArrayOf(2, 1), intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 3))
            ),
            equalTo(4)
        )
    }

    @Test
    fun maximalNetworkRank2() {
        assertThat(
            Solution()
                .maximalNetworkRank(
                    8,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(2, 4),
                        intArrayOf(5, 6),
                        intArrayOf(5, 7)
                    )
                ),
            equalTo(5)
        )
    }

    @Test
    fun maximalNetworkRank3() {
        assertThat(
            Solution()
                .maximalNetworkRank(
                    5,
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 3),
                        intArrayOf(1, 2),
                        intArrayOf(1, 3),
                        intArrayOf(2, 3),
                        intArrayOf(2, 4)
                    )
                ),
            equalTo(5)
        )
    }
}
