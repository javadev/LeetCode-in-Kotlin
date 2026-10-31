package g3801_3900.s3826_minimum_partition_score

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPartitionScore() {
        assertThat<Long>(
            Solution().minPartitionScore(intArrayOf(5, 1, 2, 1), 2),
            equalTo<Long>(25L),
        )
    }

    @Test
    fun minPartitionScore2() {
        assertThat<Long>(
            Solution().minPartitionScore(intArrayOf(1, 2, 3, 4), 1),
            equalTo<Long>(55L),
        )
    }

    @Test
    fun minPartitionScore3() {
        assertThat<Long>(
            Solution().minPartitionScore(intArrayOf(1, 1, 1), 3),
            equalTo<Long>(3L),
        )
    }
}
