package g3901_4000.s3918_sum_of_primes_between_number_and_its_reverse

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfPrimesInRange() {
        assertThat<Int>(Solution().sumOfPrimesInRange(13), equalTo<Int>(132))
    }

    @Test
    fun sumOfPrimesInRange2() {
        assertThat<Int>(Solution().sumOfPrimesInRange(10), equalTo<Int>(17))
    }

    @Test
    fun sumOfPrimesInRange3() {
        assertThat<Int>(Solution().sumOfPrimesInRange(8), equalTo<Int>(0))
    }
}
