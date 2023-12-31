package g2901_3000.s2920_maximum_points_after_collecting_coins_from_all_nodes

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumPoints() {
        assertThat(
            Solution()
                .maximumPoints(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[1,2],[2,3]"
                    ),
                    intArrayOf(10, 10, 3, 3),
                    5
                ),
            equalTo(11)
        )
    }

    @Test
    fun maximumPoints2() {
        assertThat(
            Solution()
                .maximumPoints(
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1],[0,2]"
                    ),
                    intArrayOf(8, 4, 4),
                    0
                ),
            equalTo(16)
        )
    }
}
