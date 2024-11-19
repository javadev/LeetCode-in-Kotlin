package g3101_3200.s3165_maximum_sum_of_subsequence_with_non_adjacent_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSumSubsequence() {
        assertThat(
            Solution()
                .maximumSumSubsequence(intArrayOf(3, 5, 9), arrayOf(intArrayOf(1, -2), intArrayOf(0, -3))),
            equalTo(21),
        )
    }

    @Test
    fun maximumSumSubsequence2() {
        assertThat(
            Solution().maximumSumSubsequence(intArrayOf(0, -1), arrayOf(intArrayOf(0, -5))),
            equalTo(0),
        )
    }
}
