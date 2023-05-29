package g1101_1200.s1137_n_th_tribonacci_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun tribonacci() {
        MatcherAssert.assertThat(Solution().tribonacci(4), CoreMatchers.equalTo(4))
    }

    @Test
    fun tribonacci2() {
        MatcherAssert.assertThat(Solution().tribonacci(25), CoreMatchers.equalTo(1389537))
    }
}