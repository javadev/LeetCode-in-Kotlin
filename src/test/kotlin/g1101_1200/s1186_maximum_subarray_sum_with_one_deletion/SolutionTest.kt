package g1101_1200.s1186_maximum_subarray_sum_with_one_deletion

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSum() {
        MatcherAssert.assertThat(Solution().maximumSum(intArrayOf(1, -2, 0, 3)), CoreMatchers.equalTo(4))
    }

    @Test
    fun maximumSum2() {
        MatcherAssert.assertThat(Solution().maximumSum(intArrayOf(-1, -1, -1, -1)), CoreMatchers.equalTo(-1))
    }

    @Test
    fun maximumSum3() {
        MatcherAssert.assertThat(Solution().maximumSum(intArrayOf(-1, -2, -2, -3)), CoreMatchers.equalTo(-1))
    }
}
