package g2601_2700.s2601_prime_subtraction_operation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun primeSubOperation() {
        assertThat(Solution().primeSubOperation(intArrayOf(4, 9, 6, 10)), equalTo(true))
    }

    @Test
    fun primeSubOperation2() {
        assertThat(Solution().primeSubOperation(intArrayOf(6, 8, 11, 12)), equalTo(true))
    }

    @Test
    fun primeSubOperation3() {
        assertThat(Solution().primeSubOperation(intArrayOf(5, 8, 3)), equalTo(false))
    }
}
