package g3701_3800.s3745_maximize_expression_of_three_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeExpressionOfThree() {
        assertThat<Int>(
            Solution().maximizeExpressionOfThree(intArrayOf(1, 2, 3)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maximizeExpressionOfThree2() {
        assertThat<Int>(
            Solution().maximizeExpressionOfThree(intArrayOf(5, 5, 5)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maximizeExpressionOfThree3() {
        assertThat<Int>(
            Solution().maximizeExpressionOfThree(intArrayOf(-5, -1, -3, 4)),
            equalTo<Int>(8),
        )
    }
}
