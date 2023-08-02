package g1301_1400.s1390_four_divisors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumFourDivisors() {
        assertThat(Solution().sumFourDivisors(intArrayOf(21, 4, 7)), equalTo(32))
    }

    @Test
    fun sumFourDivisors2() {
        assertThat(Solution().sumFourDivisors(intArrayOf(21, 21)), equalTo(64))
    }

    @Test
    fun sumFourDivisors3() {
        assertThat(Solution().sumFourDivisors(intArrayOf(1, 2, 3, 4, 5)), equalTo(0))
    }
}
