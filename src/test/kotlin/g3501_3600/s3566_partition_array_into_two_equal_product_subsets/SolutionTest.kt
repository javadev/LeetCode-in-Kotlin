package g3501_3600.s3566_partition_array_into_two_equal_product_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkEqualPartitions() {
        assertThat<Boolean>(
            Solution().checkEqualPartitions(intArrayOf(3, 1, 6, 8, 4), 24L),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun checkEqualPartitions2() {
        assertThat<Boolean>(
            Solution().checkEqualPartitions(intArrayOf(2, 5, 3, 7), 15L),
            equalTo<Boolean>(false),
        )
    }
}
