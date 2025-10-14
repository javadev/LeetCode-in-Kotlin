package g3701_3800.s3710_maximum_partition_factor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPartitionFactor() {
        assertThat<Int>(
            Solution().maxPartitionFactor(
                arrayOf<IntArray>(
                    intArrayOf(0, 0),
                    intArrayOf(0, 2),
                    intArrayOf(2, 0),
                    intArrayOf(2, 2),
                ),
            ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxPartitionFactor2() {
        assertThat<Int>(
            Solution().maxPartitionFactor(arrayOf<IntArray>(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(10, 0))),
            equalTo<Int>(11),
        )
    }
}
