package g3101_3200.s3102_minimize_manhattan_distances

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDistance() {
        assertThat(
            Solution()
                .minimumDistance(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[3,10],[5,15],[10,2],[4,4]"
                    )
                ),
            equalTo(12)
        )
    }

    @Test
    fun minimumDistance2() {
        assertThat(
            Solution()
                .minimumDistance(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,1],[1,1],[1,1]"
                    )
                ),
            equalTo(0)
        )
    }
}
