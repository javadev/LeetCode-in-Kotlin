package g1601_1700.s1615_maximal_network_rank

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximalNetworkRank() {
        MatcherAssert.assertThat(
            Solution().maximalNetworkRank(
                4,
                arrayOf(intArrayOf(2, 1), intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 3))
            ),
            CoreMatchers.equalTo(4)
        )
    }

    @Test
    fun maximalNetworkRank2() {
        MatcherAssert.assertThat(
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
            CoreMatchers.equalTo(5)
        )
    }

    @Test
    fun maximalNetworkRank3() {
        MatcherAssert.assertThat(
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
            CoreMatchers.equalTo(5)
        )
    }
}
