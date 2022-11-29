package g0001_0100.s0050_powx_n

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun myPow() {
        assertThat(Solution().myPow(2.00000, 10), equalTo(1024.00000))
    }

    @Test
    fun myPow2() {
        assertThat(Solution().myPow(2.10000, 3), equalTo(9.261000000000001))
    }

    @Test
    fun myPow3() {
        assertThat(Solution().myPow(2.00000, -2), equalTo(0.25000))
    }
}
