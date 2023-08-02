package g0901_1000.s0949_largest_time_for_given_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestTimeFromDigits() {
        assertThat(Solution().largestTimeFromDigits(intArrayOf(1, 2, 3, 4)), equalTo("23:41"))
    }

    @Test
    fun largestTimeFromDigits2() {
        assertThat(Solution().largestTimeFromDigits(intArrayOf(5, 5, 5, 5)), equalTo(""))
    }
}
