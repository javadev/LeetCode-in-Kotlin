package g0101_0200.s0179_largest_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestNumber() {
        assertThat(Solution().largestNumber(intArrayOf(10, 2)), equalTo("210"))
    }

    @Test
    fun largestNumber2() {
        assertThat(Solution().largestNumber(intArrayOf(3, 30, 34, 5, 9)), equalTo("9534330"))
    }
}
