package g3501_3600.s3548_equal_sum_grid_partition_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canPartitionGrid() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(2, 3),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun canPartitionGrid2() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(3, 4),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun canPartitionGrid3() {
        assertThat(
            Solution().canPartitionGrid(arrayOf(intArrayOf(1, 2, 4), intArrayOf(2, 3, 5))),
            equalTo(false),
        )
    }

    @Test
    fun canPartitionGrid4() {
        assertThat(
            Solution().canPartitionGrid(arrayOf(intArrayOf(4, 1, 8), intArrayOf(3, 2, 6))),
            equalTo(false),
        )
    }

    @Test
    fun canPartitionGrid5() {
        assertThat(
            Solution().canPartitionGrid(arrayOf(intArrayOf(1))),
            equalTo(false),
        )
    }

    @Test
    fun canPartitionGrid6() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(25372, 100000, 100000),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun canPartitionGrid7() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(100000, 100000, 100000, 100000, 1),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun canPartitionGrid8() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(55753, 55753),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun canPartitionGrid9() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(253, 10, 10),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun canPartitionGrid10() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(4, 4, 4),
                    intArrayOf(2, 2, 1),
                    intArrayOf(1, 1, 1),
                ),
            ),
            equalTo(true),
        )
    }

    @Test
    fun canPartitionGrid11() {
        assertThat(
            Solution().canPartitionGrid(
                arrayOf(
                    intArrayOf(2, 40, 2),
                    intArrayOf(4, 2, 3),
                    intArrayOf(5, 1, 6),
                    intArrayOf(7, 8, 9),
                ),
            ),
            equalTo(true),
        )
    }
}
