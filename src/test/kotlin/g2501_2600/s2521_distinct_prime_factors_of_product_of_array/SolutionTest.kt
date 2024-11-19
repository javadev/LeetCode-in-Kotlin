package g2501_2600.s2521_distinct_prime_factors_of_product_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctPrimeFactors() {
        assertThat(
            Solution().distinctPrimeFactors(intArrayOf(2, 4, 3, 7, 10, 6)),
            equalTo(4),
        )
    }

    @Test
    fun distinctPrimeFactors2() {
        assertThat(Solution().distinctPrimeFactors(intArrayOf(2, 4, 8, 16)), equalTo(1))
    }
}
