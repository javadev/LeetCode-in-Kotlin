package g1001_1100.s1015_smallest_integer_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestRepunitDivByK() {
        assertThat(Solution().smallestRepunitDivByK(1), equalTo(1))
    }

    @Test
    fun smallestRepunitDivByK2() {
        assertThat(Solution().smallestRepunitDivByK(2), equalTo(-1))
    }

    @Test
    fun smallestRepunitDivByK3() {
        assertThat(Solution().smallestRepunitDivByK(3), equalTo(3))
    }
}
