package g3601_3700.s3659_partition_array_into_k_distinct_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partitionArray() {
        assertThat(Solution().partitionArray(intArrayOf(1, 2, 3, 4), 2), equalTo(true))
    }

    @Test
    fun partitionArray2() {
        assertThat(Solution().partitionArray(intArrayOf(3, 5, 2, 2), 2), equalTo(true))
    }

    @Test
    fun partitionArray3() {
        assertThat(Solution().partitionArray(intArrayOf(1, 5, 2, 3), 3), equalTo(false))
    }

    @Test
    fun partitionArray4() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        assertThat(Solution().partitionArray(nums, 2), equalTo(false))
    }

    @Test
    fun partitionArray5() {
        val nums = intArrayOf(1, 2, 1, 2)
        assertThat(Solution().partitionArray(nums, 2), equalTo(true))
    }

    @Test
    fun partitionArray6() {
        val nums = intArrayOf(1, 1, 1, 2)
        assertThat(Solution().partitionArray(nums, 2), equalTo(false))
    }

    @Test
    fun partitionArray7() {
        val nums = intArrayOf(7)
        assertThat(Solution().partitionArray(nums, 1), equalTo(true))
    }

    @Test
    fun partitionArray8() {
        val nums = intArrayOf(5, 5, 5, 5, 5, 5)
        assertThat(Solution().partitionArray(nums, 3), equalTo(false))
    }
}
