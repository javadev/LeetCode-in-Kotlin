package g1101_1200.s1131_maximum_of_absolute_value_expression

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAbsValExpr() {
        assertThat(
            Solution().maxAbsValExpr(intArrayOf(1, 2, 3, 4), intArrayOf(-1, 4, 5, 6)),
            equalTo(13)
        )
    }

    @Test
    fun maxAbsValExpr2() {
        assertThat(
            Solution()
                .maxAbsValExpr(intArrayOf(1, -2, -5, 0, 10), intArrayOf(0, -2, -1, -7, -4)),
            equalTo(20)
        )
    }
}
