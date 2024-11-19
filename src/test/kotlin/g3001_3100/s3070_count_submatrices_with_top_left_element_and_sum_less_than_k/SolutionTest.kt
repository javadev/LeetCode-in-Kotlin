package g3001_3100.s3070_count_submatrices_with_top_left_element_and_sum_less_than_k

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubmatrices() {
        assertThat(
            Solution()
                .countSubmatrices(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[7,6,3],[6,6,1]",
                    ),
                    18,
                ),
            equalTo(4),
        )
    }

    @Test
    fun countSubmatrices2() {
        assertThat(
            Solution()
                .countSubmatrices(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[7,2,9],[1,5,0],[2,6,6]",
                    ),
                    20,
                ),
            equalTo(6),
        )
    }
}
