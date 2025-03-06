package g3401_3500.s3473_sum_of_k_subarrays_with_length_at_least_m

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat<Int>(
            Solution().maxSum(intArrayOf(1, 2, -1, 3, 3, 4), 2, 2),
            equalTo<Int>(13),
        )
    }

    @Test
    fun maxSum2() {
        assertThat<Int>(
            Solution().maxSum(intArrayOf(-10, 3, -1, -2), 4, 1),
            equalTo<Int>(-10),
        )
    }
}
