package g0601_0700.s0633_sum_of_square_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun judgeSquareSum() {
        assertThat(Solution().judgeSquareSum(5), equalTo(true))
    }

    @Test
    fun judgeSquareSum2() {
        assertThat(Solution().judgeSquareSum(3), equalTo(false))
    }
}
