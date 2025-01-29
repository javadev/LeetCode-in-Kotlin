package g3401_3500.s3432_count_partitions_with_even_sum_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPartitions() {
        assertThat<Int>(
            Solution().countPartitions(intArrayOf(10, 10, 3, 7, 6)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countPartitions2() {
        assertThat<Int>(Solution().countPartitions(intArrayOf(1, 2, 2)), equalTo<Int>(0))
    }

    @Test
    fun countPartitions3() {
        assertThat<Int>(
            Solution().countPartitions(intArrayOf(2, 4, 6, 8)),
            equalTo<Int>(3),
        )
    }
}
