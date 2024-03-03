package g3001_3100.s3030_find_the_grid_of_region_average

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultGrid() {
        assertThat(
            Solution()
                .resultGrid(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[5,6,7,10],[8,9,10,10],[11,12,13,10]"
                    ),
                    3
                ),
            equalTo(
                convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                    "[9,9,9,9],[9,9,9,9],[9,9,9,9]"
                )
            )
        )
    }

    @Test
    fun resultGrid2() {
        assertThat(
            Solution()
                .resultGrid(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[10,20,30],[15,25,35],[20,30,40],[25,35,45]"
                    ),
                    12
                ),
            equalTo(
                convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                    "[25,25,25],[27,27,27],[27,27,27],[30,30,30]"
                )
            )
        )
    }

    @Test
    fun resultGrid3() {
        assertThat(
            Solution()
                .resultGrid(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[5,6,7],[8,9,10],[11,12,13]"
                    ),
                    1
                ),
            equalTo(
                convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                    "[5,6,7],[8,9,10],[11,12,13]"
                )
            )
        )
    }
}
