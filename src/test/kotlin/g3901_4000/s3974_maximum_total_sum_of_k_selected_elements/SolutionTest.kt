package g3901_4000.s3974_maximum_total_sum_of_k_selected_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat<Long>(
            Solution().maxSum(intArrayOf(6, 1, 2, 9), 3, 2),
            equalTo<Long>(26L),
        )
    }

    @Test
    fun maxSum2() {
        assertThat<Long>(
            Solution().maxSum(intArrayOf(3, 7, 5, 2), 2, 4),
            equalTo<Long>(43L),
        )
    }

    @Test
    fun maxSum3() {
        assertThat<Long>(Solution().maxSum(intArrayOf(4, 4), 1, 1), equalTo<Long>(4L))
    }
}
