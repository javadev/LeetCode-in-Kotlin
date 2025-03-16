package g3401_3500.s3487_maximum_unique_subarray_sum_after_deletion

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat<Int>(Solution().maxSum(intArrayOf(1, 2, 3, 4, 5)), equalTo<Int>(15))
    }

    @Test
    fun maxSum2() {
        assertThat<Int>(Solution().maxSum(intArrayOf(1, 1, 0, 1, 1)), equalTo<Int>(1))
    }

    @Test
    fun maxSum3() {
        assertThat<Int>(
            Solution().maxSum(intArrayOf(1, 2, -1, -2, 1, 0, -1)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxSum4() {
        assertThat<Int>(Solution().maxSum(intArrayOf(-100)), equalTo<Int>(-100))
    }
}
