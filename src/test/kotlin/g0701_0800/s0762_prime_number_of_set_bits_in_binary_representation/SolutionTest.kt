package g0701_0800.s0762_prime_number_of_set_bits_in_binary_representation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPrimeSetBits() {
        assertThat(Solution().countPrimeSetBits(6, 10), equalTo(4))
    }

    @Test
    fun countPrimeSetBits2() {
        assertThat(Solution().countPrimeSetBits(10, 15), equalTo(5))
    }
}
