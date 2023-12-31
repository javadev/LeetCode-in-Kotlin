package g2901_3000.s2925_maximum_score_after_applying_operations_on_a_tree

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScoreAfterOperations() {
        assertThat(
            Solution()
                .maximumScoreAfterOperations(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2],[0,3],[2,4],[4,5]"
                    ),
                    intArrayOf(5, 2, 5, 2, 1, 1)
                ),
            equalTo(11L)
        )
    }

    @Test
    fun maximumScoreAfterOperations2() {
        assertThat(
            Solution()
                .maximumScoreAfterOperations(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]"
                    ),
                    intArrayOf(20, 10, 9, 7, 4, 3, 5)
                ),
            equalTo(40L)
        )
    }
}
