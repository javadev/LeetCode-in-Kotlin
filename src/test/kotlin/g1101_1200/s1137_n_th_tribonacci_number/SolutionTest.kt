package g1101_1200.s1137_n_th_tribonacci_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun tribonacci() {
        assertThat(Solution().tribonacci(4), equalTo(4))
    }

    @Test
    fun tribonacci2() {
        assertThat(Solution().tribonacci(25), equalTo(1389537))
    }
}
