package g3501_3600.s3591_check_if_any_element_has_prime_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkPrimeFrequency() {
        assertThat<Boolean>(
            Solution().checkPrimeFrequency(intArrayOf(1, 2, 3, 4, 5, 4)),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun checkPrimeFrequency2() {
        assertThat<Boolean>(
            Solution().checkPrimeFrequency(intArrayOf(1, 2, 3, 4, 5)),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun checkPrimeFrequency3() {
        assertThat<Boolean>(
            Solution().checkPrimeFrequency(intArrayOf(2, 2, 2, 4, 4)),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun checkPrimeFrequency4() {
        val arr = intArrayOf(7)
        assertThat<Boolean>(Solution().checkPrimeFrequency(arr), equalTo<Boolean>(false))
    }

    @Test
    fun checkPrimeFrequency5() {
        val arr = intArrayOf(2, 2, 2)
        assertThat<Boolean>(Solution().checkPrimeFrequency(arr), equalTo<Boolean>(true))
    }

    @Test
    fun checkPrimeFrequency6() {
        val arr = intArrayOf(4, 4, 4, 4)
        assertThat<Boolean>(Solution().checkPrimeFrequency(arr), equalTo<Boolean>(false))
    }

    @Test
    fun checkPrimeFrequency7() {
        val arr = intArrayOf(2, 3, 3, 3)
        assertThat<Boolean>(Solution().checkPrimeFrequency(arr), equalTo<Boolean>(true))
    }

    @Test
    fun checkPrimeFrequency8() {
        val arr = intArrayOf(2, 3, 4, 5)
        assertThat<Boolean>(Solution().checkPrimeFrequency(arr), equalTo<Boolean>(false))
    }

    @Test
    fun checkPrimeFrequency9() {
        val arr = intArrayOf(1, 10)
        assertThat<Boolean>(Solution().checkPrimeFrequency(arr), equalTo<Boolean>(false))
    }
}
