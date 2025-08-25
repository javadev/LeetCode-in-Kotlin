package g3601_3700.s3658_gcd_of_odd_and_even_sums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gcdOfOddEvenSums() {
        assertThat<Int>(Solution().gcdOfOddEvenSums(4), equalTo<Int>(4))
    }

    @Test
    fun gcdOfOddEvenSums2() {
        assertThat<Int>(Solution().gcdOfOddEvenSums(5), equalTo<Int>(5))
    }
}
