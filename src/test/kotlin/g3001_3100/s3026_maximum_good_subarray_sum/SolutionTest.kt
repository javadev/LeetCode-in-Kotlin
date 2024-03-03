package g3001_3100.s3026_maximum_good_subarray_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSubarraySum() {
        assertThat(
            Solution().maximumSubarraySum(intArrayOf(1, 2, 3, 4, 5, 6), 1), equalTo(11L)
        )
    }

    @Test
    fun maximumSubarraySum2() {
        assertThat(
            Solution().maximumSubarraySum(intArrayOf(-1, 3, 2, 4, 5), 3),
            equalTo(11L)
        )
    }

    @Test
    fun maximumSubarraySum3() {
        assertThat(
            Solution().maximumSubarraySum(intArrayOf(-1, -2, -3, -4), 2),
            equalTo(-6L)
        )
    }
}
