package g2801_2900.s2858_minimum_edge_reversals_so_every_node_is_reachable

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minEdgeReversals() {
        MatcherAssert.assertThat(
            Solution()
                .minEdgeReversals(
                    4,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[2,0],[2,1],[1,3]"
                    )
                ),
            CoreMatchers.equalTo(intArrayOf(1, 1, 0, 2))
        )
    }

    @Test
    fun minEdgeReversals2() {
        MatcherAssert.assertThat(
            Solution()
                .minEdgeReversals(
                    3,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[2,0]"
                    )
                ),
            CoreMatchers.equalTo(intArrayOf(2, 0, 1))
        )
    }
}
