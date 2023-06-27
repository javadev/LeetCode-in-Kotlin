package g0501_0600.s0509_fibonacci_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fib() {
        assertThat(Solution().fib(2), equalTo(1))
    }

    @Test
    fun fib2() {
        assertThat(Solution().fib(3), equalTo(2))
    }

    @Test
    fun fib3() {
        assertThat(Solution().fib(4), equalTo(3))
    }
}
