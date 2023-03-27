package g0601_0700.s0698_partition_to_k_equal_sum_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canPartitionKSubsets() {
        assertThat(
            Solution().canPartitionKSubsets(intArrayOf(4, 3, 2, 3, 5, 2, 1), 4),
            equalTo(true)
        )
    }

    @Test
    fun canPartitionKSubsets2() {
        assertThat(Solution().canPartitionKSubsets(intArrayOf(1, 2, 3, 4), 3), equalTo(false))
    }
}
