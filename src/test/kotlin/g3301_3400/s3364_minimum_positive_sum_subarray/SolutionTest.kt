package g3301_3400.s3364_minimum_positive_sum_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSumSubarray() {
        assertThat<Int>(
            Solution().minimumSumSubarray(listOf<Int>(3, -2, 1, 4), 2, 3),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minimumSumSubarray2() {
        assertThat<Int>(
            Solution().minimumSumSubarray(listOf<Int>(-2, 2, -3, 1), 2, 3),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minimumSumSubarray3() {
        assertThat<Int>(
            Solution().minimumSumSubarray(listOf<Int>(1, 2, 3, 4), 2, 4),
            equalTo<Int>(3),
        )
    }
}
