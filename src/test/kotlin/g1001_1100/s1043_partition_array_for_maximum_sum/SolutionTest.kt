package g1001_1100.s1043_partition_array_for_maximum_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumAfterPartitioning() {
        assertThat(
            Solution().maxSumAfterPartitioning(intArrayOf(1, 15, 7, 9, 2, 5, 10), 3),
            equalTo(84)
        )
    }

    @Test
    fun maxSumAfterPartitioning2() {
        assertThat(
            Solution()
                .maxSumAfterPartitioning(intArrayOf(1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3), 4),
            equalTo(83)
        )
    }

    @Test
    fun maxSumAfterPartitioning3() {
        assertThat(Solution().maxSumAfterPartitioning(intArrayOf(1), 1), equalTo(1))
    }
}
