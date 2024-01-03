package g2901_3000.s2931_maximum_spending_after_buying_items

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSpending() {
        assertThat(
            Solution()
                .maxSpending(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[8,5,2],[6,4,1],[9,7,3]"
                    )
                ),
            equalTo(285L)
        )
    }

    @Test
    fun maxSpending2() {
        assertThat(
            Solution()
                .maxSpending(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[10,8,6,4,2],[9,7,5,3,2]"
                    )
                ),
            equalTo(386L)
        )
    }
}
