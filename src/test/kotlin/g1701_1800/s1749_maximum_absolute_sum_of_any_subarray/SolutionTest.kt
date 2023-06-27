package g1701_1800.s1749_maximum_absolute_sum_of_any_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAbsoluteSum() {
        assertThat(Solution().maxAbsoluteSum(intArrayOf(1, -3, 2, 3, -4)), equalTo(5))
    }

    @Test
    fun maxAbsoluteSum2() {
        assertThat(Solution().maxAbsoluteSum(intArrayOf(2, -5, 1, -4, 3, -2)), equalTo(8))
    }
}
