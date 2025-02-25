package g3401_3500.s3462_maximum_sum_with_at_most_k_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat<Long>(
            Solution().maxSum(arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(3, 4)), intArrayOf(1, 2), 2),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maxSum2() {
        assertThat<Long>(
            Solution().maxSum(arrayOf<IntArray>(intArrayOf(5, 3, 7), intArrayOf(8, 2, 6)), intArrayOf(2, 2), 3),
            equalTo<Long>(21L),
        )
    }

    @Test
    fun maxSum3() {
        assertThat<Long>(
            Solution().maxSum(arrayOf<IntArray>(), intArrayOf(2, 2), 3),
            equalTo<Long>(0L),
        )
    }
}
