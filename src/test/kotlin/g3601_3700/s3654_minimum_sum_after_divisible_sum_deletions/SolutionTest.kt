package g3601_3700.s3654_minimum_sum_after_divisible_sum_deletions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minArraySum() {
        assertThat<Long>(Solution().minArraySum(intArrayOf(1, 1, 1), 2), equalTo<Long>(1L))
    }

    @Test
    fun minArraySum2() {
        assertThat<Long>(
            Solution().minArraySum(intArrayOf(3, 1, 4, 1, 5), 3),
            equalTo<Long>(5L),
        )
    }
}
