package g3501_3600.s3546_equal_sum_grid_partition_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canPartitionGrid() {
        assertThat<Boolean>(
            Solution().canPartitionGrid(
                arrayOf<IntArray>(
                    intArrayOf(1, 4),
                    intArrayOf(2, 3),
                ),
            ),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun canPartitionGrid2() {
        assertThat<Boolean>(
            Solution().canPartitionGrid(
                arrayOf<IntArray>(
                    intArrayOf(1, 3),
                    intArrayOf(2, 4),
                ),
            ),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun canPartitionGrid3() {
        assertThat<Boolean>(
            Solution().canPartitionGrid(arrayOf<IntArray>(intArrayOf(1))),
            equalTo<Boolean>(false),
        )
    }
}
