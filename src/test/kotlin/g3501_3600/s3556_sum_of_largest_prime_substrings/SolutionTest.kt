package g3501_3600.s3556_sum_of_largest_prime_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfLargestPrimes() {
        assertThat<Long>(Solution().sumOfLargestPrimes("12234"), equalTo<Long>(1469L))
    }

    @Test
    fun sumOfLargestPrimes2() {
        assertThat<Long>(Solution().sumOfLargestPrimes("111"), equalTo<Long>(11L))
    }
}
