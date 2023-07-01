package g2301_2400.s2342_max_sum_of_a_pair_with_equal_sum_of_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSum() {
        assertThat(Solution().maximumSum(intArrayOf(18, 43, 36, 13, 7)), equalTo(54))
    }

    @Test
    fun maximumSum2() {
        assertThat(Solution().maximumSum(intArrayOf(10, 12, 19, 14)), equalTo(-1))
    }
}
