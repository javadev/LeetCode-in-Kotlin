package g3601_3700.s3658_gcd_of_odd_and_even_sums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gcdOfOddEvenSums() {
        assertThat(Solution().gcdOfOddEvenSums(4), equalTo(4))
    }

    @Test
    fun gcdOfOddEvenSums2() {
        assertThat(Solution().gcdOfOddEvenSums(5), equalTo(5))
    }

    @Test
    fun gcdOfOddEvenSums3() {
        assertThat(Solution().gcdOfOddEvenSums(42), equalTo(42))
    }

    @Test
    fun gcdOfOddEvenSums4() {
        assertThat(Solution().gcdOfOddEvenSums(-42), equalTo(42))
    }

    @Test
    fun gcdOfOddEvenSums5() {
        assertThat(Solution().gcdOfOddEvenSums(0), equalTo(0))
    }
}
