package g0301_0400.s0371_sum_of_two_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getSum() {
        assertThat(Solution().getSum(1, 2), equalTo(3))
    }

    @Test
    fun getSum2() {
        assertThat(Solution().getSum(2, 3), equalTo(5))
    }
}
