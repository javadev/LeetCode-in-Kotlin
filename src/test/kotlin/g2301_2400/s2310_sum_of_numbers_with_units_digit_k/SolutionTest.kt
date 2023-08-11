package g2301_2400.s2310_sum_of_numbers_with_units_digit_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumNumbers() {
        assertThat(Solution().minimumNumbers(58, 9), equalTo(2))
    }

    @Test
    fun minimumNumbers2() {
        assertThat(Solution().minimumNumbers(37, 2), equalTo(-1))
    }

    @Test
    fun minimumNumbers3() {
        assertThat(Solution().minimumNumbers(0, 7), equalTo(0))
    }

    @Test
    fun minimumNumbers4() {
        assertThat(Solution().minimumNumbers(2, 8), equalTo(-1))
    }
}
