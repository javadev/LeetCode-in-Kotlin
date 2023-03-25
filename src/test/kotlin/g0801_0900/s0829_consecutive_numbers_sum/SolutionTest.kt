package g0801_0900.s0829_consecutive_numbers_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun consecutiveNumbersSum() {
        assertThat(Solution().consecutiveNumbersSum(5), equalTo(2))
    }

    @Test
    fun consecutiveNumbersSum2() {
        assertThat(Solution().consecutiveNumbersSum(9), equalTo(3))
    }

    @Test
    fun consecutiveNumbersSum3() {
        assertThat(Solution().consecutiveNumbersSum(15), equalTo(4))
    }
}
