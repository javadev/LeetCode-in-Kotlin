package g3501_3600.s3578_count_partitions_with_max_min_difference_at_most_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPartitions() {
        assertThat<Int>(
            Solution().countPartitions(intArrayOf(9, 4, 1, 3, 7), 4),
            equalTo<Int>(6),
        )
    }

    @Test
    fun countPartitions2() {
        assertThat<Int>(
            Solution().countPartitions(intArrayOf(3, 3, 4), 0),
            equalTo<Int>(2),
        )
    }
}
