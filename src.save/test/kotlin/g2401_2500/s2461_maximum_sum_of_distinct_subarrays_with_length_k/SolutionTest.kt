package g2401_2500.s2461_maximum_sum_of_distinct_subarrays_with_length_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSubarraySum() {
        assertThat(
            Solution().maximumSubarraySum(intArrayOf(1, 5, 4, 2, 9, 9, 9), 3),
            equalTo(15L)
        )
    }

    @Test
    fun maximumSubarraySum2() {
        assertThat(Solution().maximumSubarraySum(intArrayOf(4, 4, 4), 3), equalTo(0L))
    }
}
