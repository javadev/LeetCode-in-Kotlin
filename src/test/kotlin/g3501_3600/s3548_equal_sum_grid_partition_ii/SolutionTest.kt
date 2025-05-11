package g3501_3600.s3548_equal_sum_grid_partition_ii

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
                    intArrayOf(2, 3)
                )
            ), equalTo<Boolean>(true)
        )
    }

    @Test
    fun canPartitionGrid2() {
        assertThat<Boolean>(
            Solution().canPartitionGrid(
                arrayOf<IntArray>(
                    intArrayOf(1, 2),
                    intArrayOf(3, 4)
                )
            ), equalTo<Boolean>(true)
        )
    }

    @Test
    fun canPartitionGrid3() {
        assertThat<Boolean>(
            Solution().canPartitionGrid(arrayOf<IntArray>(intArrayOf(1, 2, 4), intArrayOf(2, 3, 5))),
            equalTo<Boolean>(false)
        )
    }

    @Test
    fun canPartitionGrid4() {
        assertThat<Boolean>(
            Solution().canPartitionGrid(arrayOf<IntArray>(intArrayOf(4, 1, 8), intArrayOf(3, 2, 6))),
            equalTo<Boolean>(false)
        )
    }

    @Test
    fun canPartitionGrid5() {
        assertThat<Boolean>(
            Solution().canPartitionGrid(arrayOf<IntArray>(intArrayOf(1))),
            equalTo<Boolean>(false)
        )
    }
}
