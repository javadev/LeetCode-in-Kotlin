package g3701_3800.s3772_maximum_subgraph_score_in_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubgraphScore() {
        assertThat<IntArray>(
            Solution()
                .maxSubgraphScore(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)), intArrayOf(1, 0, 1)),
            equalTo<IntArray>(intArrayOf(1, 1, 1)),
        )
    }

    @Test
    fun maxSubgraphScore2() {
        assertThat<IntArray>(
            Solution()
                .maxSubgraphScore(
                    5,
                    arrayOf<IntArray>(intArrayOf(1, 0), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(3, 4)),
                    intArrayOf(0, 1, 0, 1, 1),
                ),
            equalTo<IntArray>(intArrayOf(2, 3, 2, 3, 3)),
        )
    }

    @Test
    fun maxSubgraphScore3() {
        assertThat<IntArray>(
            Solution().maxSubgraphScore(2, arrayOf<IntArray>(intArrayOf(0, 1)), intArrayOf(0, 0)),
            equalTo<IntArray>(intArrayOf(-1, -1)),
        )
    }
}
