package g3201_3300.s3277_maximum_xor_score_subarray_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSubarrayXor() {
        assertThat(
            Solution()
                .maximumSubarrayXor(
                    intArrayOf(2, 8, 4, 32, 16, 1),
                    arrayOf(intArrayOf(0, 2), intArrayOf(1, 4), intArrayOf(0, 5)),
                ),
            equalTo(intArrayOf(12, 60, 60)),
        )
    }

    @Test
    fun maximumSubarrayXor2() {
        assertThat(
            Solution()
                .maximumSubarrayXor(
                    intArrayOf(0, 7, 3, 2, 8, 5, 1),
                    arrayOf(intArrayOf(0, 3), intArrayOf(1, 5), intArrayOf(2, 4), intArrayOf(2, 6), intArrayOf(5, 6)),
                ),
            equalTo(intArrayOf(7, 14, 11, 14, 5)),
        )
    }
}
