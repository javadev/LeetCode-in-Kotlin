package g2801_2900.s2846_minimum_edge_weight_equilibrium_queries_in_a_tree

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperationsQueries() {
        assertThat(
            Solution()
                .minOperationsQueries(
                    7,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1,1],[1,2,1],[2,3,1],[3,4,2],[4,5,2],[5,6,2]"
                    ),
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,3],[3,6],[2,6],[0,6]"
                    )
                ),
            equalTo(intArrayOf(0, 0, 1, 3))
        )
    }

    @Test
    fun minOperationsQueries2() {
        assertThat(
            Solution()
                .minOperationsQueries(
                    8,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2,6],[1,3,4],[2,4,6],[2,5,3],[3,6,6],[3,0,8],[7,0,2]"
                    ),
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[4,6],[0,4],[6,5],[7,4]"
                    )
                ),
            equalTo(intArrayOf(1, 2, 2, 3))
        )
    }
}
