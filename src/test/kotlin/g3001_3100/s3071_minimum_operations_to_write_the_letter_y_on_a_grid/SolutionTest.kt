package g3001_3100.s3071_minimum_operations_to_write_the_letter_y_on_a_grid

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperationsToWriteY() {
        assertThat(
            Solution()
                .minimumOperationsToWriteY(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2,2],[1,1,0],[0,1,0]"
                    )
                ),
            equalTo(3)
        )
    }

    @Test
    fun minimumOperationsToWriteY2() {
        assertThat(
            Solution()
                .minimumOperationsToWriteY(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1,0,1,0],[2,1,0,1,2],[2,2,2,0,1],[2,2,2,2,2],[2,1,2,2,2]"
                    )
                ),
            equalTo(12)
        )
    }
}
