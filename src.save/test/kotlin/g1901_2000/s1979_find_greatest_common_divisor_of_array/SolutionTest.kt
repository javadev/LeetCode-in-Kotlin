package g1901_2000.s1979_find_greatest_common_divisor_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findGCD() {
        assertThat(Solution().findGCD(intArrayOf(2, 5, 6, 9, 10)), equalTo(2))
    }

    @Test
    fun findGCD2() {
        assertThat(Solution().findGCD(intArrayOf(7, 5, 6, 8, 3)), equalTo(1))
    }

    @Test
    fun findGCD3() {
        assertThat(Solution().findGCD(intArrayOf(3, 3)), equalTo(3))
    }
}
