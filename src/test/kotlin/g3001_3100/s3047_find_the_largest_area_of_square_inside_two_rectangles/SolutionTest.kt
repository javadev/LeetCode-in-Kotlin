package g3001_3100.s3047_find_the_largest_area_of_square_inside_two_rectangles

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestSquareArea() {
        assertThat(
            Solution()
                .largestSquareArea(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,1],[2,2],[3,1]"
                    ),
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[3,3],[4,4],[6,6]"
                    )
                ),
            equalTo(1L)
        )
    }

    @Test
    fun largestSquareArea2() {
        assertThat(
            Solution()
                .largestSquareArea(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,1],[2,2],[1,2]"
                    ),
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[3,3],[4,4],[3,4]"
                    )
                ),
            equalTo(1L)
        )
    }

    @Test
    fun largestSquareArea3() {
        assertThat(
            Solution()
                .largestSquareArea(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,1],[3,3],[3,1]"
                    ),
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[2,2],[4,4],[4,2]"
                    )
                ),
            equalTo(0L)
        )
    }
}
