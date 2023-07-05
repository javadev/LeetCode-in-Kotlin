package g2401_2500.s2447_number_of_subarrays_with_gcd_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarrayGCD() {
        assertThat(Solution().subarrayGCD(intArrayOf(9, 3, 1, 2, 6, 3), 3), equalTo(4))
    }

    @Test
    fun subarrayGCD2() {
        assertThat(Solution().subarrayGCD(intArrayOf(4), 7), equalTo(0))
    }
}
