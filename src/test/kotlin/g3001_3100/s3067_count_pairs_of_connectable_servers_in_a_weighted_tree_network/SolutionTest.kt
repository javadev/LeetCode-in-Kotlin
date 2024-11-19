package g3001_3100.s3067_count_pairs_of_connectable_servers_in_a_weighted_tree_network

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairsOfConnectableServers() {
        assertThat(
            Solution()
                .countPairsOfConnectableServers(
                    arrayOf(
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 2, 5),
                        intArrayOf(2, 3, 13),
                        intArrayOf(3, 4, 9),
                        intArrayOf(4, 5, 2),
                    ),
                    1,
                ),
            equalTo(intArrayOf(0, 4, 6, 6, 4, 0)),
        )
    }

    @Test
    fun countPairsOfConnectableServers2() {
        assertThat(
            Solution()
                .countPairsOfConnectableServers(
                    arrayOf(
                        intArrayOf(0, 6, 3),
                        intArrayOf(6, 5, 3),
                        intArrayOf(0, 3, 1),
                        intArrayOf(3, 2, 7),
                        intArrayOf(3, 1, 6),
                        intArrayOf(3, 4, 2),
                    ),
                    3,
                ),
            equalTo(intArrayOf(2, 0, 0, 0, 0, 0, 2)),
        )
    }
}
