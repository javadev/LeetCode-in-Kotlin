package g2901_3000.s2918_minimum_equal_sum_of_two_arrays_after_replacing_zeros

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSum() {
        assertThat(
            Solution().minSum(intArrayOf(3, 2, 0, 1, 0), intArrayOf(6, 5, 0)),
            equalTo(12L),
        )
    }

    @Test
    fun minSum2() {
        assertThat(Solution().minSum(intArrayOf(2, 0, 2, 0), intArrayOf(1, 4)), equalTo(-1L))
    }
}
