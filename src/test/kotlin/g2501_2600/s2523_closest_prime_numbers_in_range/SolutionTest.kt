package g2501_2600.s2523_closest_prime_numbers_in_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestPrimes() {
        assertThat(Solution().closestPrimes(10, 19), equalTo(intArrayOf(11, 13)))
    }

    @Test
    fun closestPrimes2() {
        assertThat(Solution().closestPrimes(4, 6), equalTo(intArrayOf(-1, -1)))
    }
}
