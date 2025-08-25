package g3601_3700.s3659_partition_array_into_k_distinct_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partitionArray() {
        assertThat<Boolean>(
            Solution().partitionArray(intArrayOf(1, 2, 3, 4), 2),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun partitionArray2() {
        assertThat<Boolean>(
            Solution().partitionArray(intArrayOf(3, 5, 2, 2), 2),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun partitionArray3() {
        assertThat<Boolean>(
            Solution().partitionArray(intArrayOf(1, 5, 2, 3), 3),
            equalTo<Boolean>(false),
        )
    }
}
