package g1401_1500.s1414_find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMinFibonacciNumbers() {
        assertThat(Solution().findMinFibonacciNumbers(7), equalTo(2))
    }

    @Test
    fun findMinFibonacciNumbers2() {
        assertThat(Solution().findMinFibonacciNumbers(10), equalTo(2))
    }

    @Test
    fun findMinFibonacciNumbers3() {
        assertThat(Solution().findMinFibonacciNumbers(19), equalTo(3))
    }
}
