package g3701_3800.s3770_largest_prime_from_consecutive_prime_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestPrime() {
        assertThat<Int>(Solution().largestPrime(100), equalTo<Int>(41))
    }

    @Test
    fun largestPrime2() {
        assertThat<Int>(Solution().largestPrime(2), equalTo<Int>(2))
    }

    @Test
    fun largestPrime3() {
        assertThat<Int>(Solution().largestPrime(1), equalTo<Int>(0))
    }
}
