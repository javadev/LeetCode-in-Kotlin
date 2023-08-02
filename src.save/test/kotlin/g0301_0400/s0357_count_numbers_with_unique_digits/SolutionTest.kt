package g0301_0400.s0357_count_numbers_with_unique_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countNumbersWithUniqueDigits() {
        assertThat(Solution().countNumbersWithUniqueDigits(2), equalTo(91))
    }

    @Test
    fun countNumbersWithUniqueDigits2() {
        assertThat(Solution().countNumbersWithUniqueDigits(0), equalTo(1))
    }
}
