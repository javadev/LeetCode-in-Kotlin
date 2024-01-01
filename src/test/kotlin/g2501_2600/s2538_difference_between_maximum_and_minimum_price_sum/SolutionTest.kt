package g2501_2600.s2538_difference_between_maximum_and_minimum_price_sum

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxOutput() {
        assertThat(
            Solution()
                .maxOutput(
                    6,
                    CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                        "[0,1],[1,2],[1,3],[3,4],[3,5]"
                    ),
                    intArrayOf(9, 8, 7, 6, 10, 5)
                ),
            equalTo(24L)
        )
    }

    @Test
    fun maxOutput2() {
        assertThat(
            Solution()
                .maxOutput(
                    3,
                    CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                        "[0,1],[1,2]"
                    ),
                    intArrayOf(1, 1, 1)
                ),
            equalTo(2L)
        )
    }
}
