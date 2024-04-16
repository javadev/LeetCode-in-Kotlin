package g3001_3100.s3080_mark_elements_on_array_by_performing_queries

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun unmarkedSumArray() {
        assertThat(
            Solution()
                .unmarkedSumArray(
                    intArrayOf(1, 2, 2, 1, 2, 3, 1),
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[3,3],[4,2]"
                    )
                ),
            equalTo(longArrayOf(8, 3, 0))
        )
    }

    @Test
    fun unmarkedSumArray2() {
        assertThat(
            Solution().unmarkedSumArray(intArrayOf(1, 4, 2, 3), arrayOf(intArrayOf(0, 1))),
            equalTo(longArrayOf(7))
        )
    }
}
