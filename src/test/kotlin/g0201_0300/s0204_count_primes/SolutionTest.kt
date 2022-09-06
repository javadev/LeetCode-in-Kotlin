package g0201_0300.s0204_count_primes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPrimes() {
        assertThat(Solution().countPrimes(10), equalTo(4))
    }

    @Test
    fun countPrimes2() {
        assertThat(Solution().countPrimes(0), equalTo(0))
    }

    @Test
    fun countPrimes3() {
        assertThat(Solution().countPrimes(1), equalTo(0))
    }
}
