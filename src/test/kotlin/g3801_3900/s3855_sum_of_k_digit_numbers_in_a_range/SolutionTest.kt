package g3801_3900.s3855_sum_of_k_digit_numbers_in_a_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfNumbers() {
        assertThat<Int>(Solution().sumOfNumbers(1, 2, 2), equalTo<Int>(66))
    }

    @Test
    fun sumOfNumbers2() {
        assertThat<Int>(Solution().sumOfNumbers(0, 1, 3), equalTo<Int>(444))
    }

    @Test
    fun sumOfNumbers3() {
        assertThat<Int>(Solution().sumOfNumbers(5, 5, 10), equalTo<Int>(555555520))
    }
}
