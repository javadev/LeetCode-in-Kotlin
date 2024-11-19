package g3001_3100.s3033_modify_the_matrix

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun modifiedMatrix() {
        assertThat(
            Solution()
                .modifiedMatrix(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2,-1],[4,-1,6],[7,8,9]",
                    ),
                ),
            equalTo(
                convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                    "[1,2,9],[4,8,6],[7,8,9]",
                ),
            ),
        )
    }

    @Test
    fun modifiedMatrix2() {
        assertThat(
            Solution().modifiedMatrix(arrayOf(intArrayOf(3, -1), intArrayOf(5, 2))),
            equalTo(arrayOf(intArrayOf(3, 2), intArrayOf(5, 2))),
        )
    }
}
