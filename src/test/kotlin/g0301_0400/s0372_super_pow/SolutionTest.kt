package g0301_0400.s0372_super_pow

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun superPow() {
        assertThat(Solution().superPow(2, intArrayOf(3)), equalTo(8))
    }

    @Test
    fun superPow2() {
        assertThat(Solution().superPow(2, intArrayOf(1, 0)), equalTo(1024))
    }

    @Test
    fun superPow3() {
        assertThat(Solution().superPow(1, intArrayOf(4, 3, 3, 8, 5, 2)), equalTo(1))
    }

    @Test
    fun superPow4() {
        assertThat(Solution().superPow(2147483647, intArrayOf(2, 0, 0)), equalTo(1198))
    }
}
