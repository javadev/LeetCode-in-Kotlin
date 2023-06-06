package g1301_1400.s1362_closest_divisors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closestDivisors() {
        assertThat(Solution().closestDivisors(8), equalTo(intArrayOf(3, 3)))
    }

    @Test
    fun closestDivisors2() {
        assertThat(Solution().closestDivisors(123), equalTo(intArrayOf(5, 25)))
    }

    @Test
    fun closestDivisors3() {
        assertThat(Solution().closestDivisors(999), equalTo(intArrayOf(25, 40)))
    }
}
