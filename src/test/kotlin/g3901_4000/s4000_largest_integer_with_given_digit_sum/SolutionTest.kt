package g3901_4000.s4000_largest_integer_with_given_digit_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestInteger() {
        assertThat<Int>(Solution().largestInteger(2, 9), equalTo<Int>(90))
    }

    @Test
    fun largestInteger2() {
        assertThat<Int>(Solution().largestInteger(2, 19), equalTo<Int>(-1))
    }

    @Test
    fun largestInteger3() {
        assertThat<Int>(Solution().largestInteger(5, 0), equalTo<Int>(0))
    }
}
