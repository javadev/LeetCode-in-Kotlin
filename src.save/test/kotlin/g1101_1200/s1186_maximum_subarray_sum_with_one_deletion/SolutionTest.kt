package g1101_1200.s1186_maximum_subarray_sum_with_one_deletion

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSum() {
        assertThat(Solution().maximumSum(intArrayOf(1, -2, 0, 3)), equalTo(4))
    }

    @Test
    fun maximumSum2() {
        assertThat(Solution().maximumSum(intArrayOf(-1, -1, -1, -1)), equalTo(-1))
    }

    @Test
    fun maximumSum3() {
        assertThat(Solution().maximumSum(intArrayOf(-1, -2, -2, -3)), equalTo(-1))
    }
}
