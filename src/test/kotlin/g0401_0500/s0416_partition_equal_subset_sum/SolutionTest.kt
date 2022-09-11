package g0401_0500.s0416_partition_equal_subset_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canPartition() {
        assertThat(Solution().canPartition(intArrayOf(1, 5, 11, 5)), equalTo(true))
    }

    @Test
    fun canPartition2() {
        assertThat(Solution().canPartition(intArrayOf(1, 2, 3, 5)), equalTo(false))
    }
}
