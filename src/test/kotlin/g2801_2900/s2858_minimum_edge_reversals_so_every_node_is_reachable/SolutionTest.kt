package g2801_2900.s2858_minimum_edge_reversals_so_every_node_is_reachable

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minEdgeReversals() {
        assertThat(
            Solution()
                .minEdgeReversals(
                    4,
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[2,0],[2,1],[1,3]",
                    ),
                ),
            equalTo(intArrayOf(1, 1, 0, 2)),
        )
    }

    @Test
    fun minEdgeReversals2() {
        assertThat(
            Solution()
                .minEdgeReversals(
                    3,
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[2,0]",
                    ),
                ),
            equalTo(intArrayOf(2, 0, 1)),
        )
    }
}
