package g3701_3800.s3765_complete_prime_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun completePrime() {
        assertThat<Boolean>(Solution().completePrime(239), equalTo<Boolean>(false))
    }

    @Test
    fun completePrime2() {
        assertThat<Boolean>(Solution().completePrime(21), equalTo<Boolean>(false))
    }

    @Test
    fun completePrime3() {
        assertThat<Boolean>(Solution().completePrime(2), equalTo<Boolean>(true))
    }
}
