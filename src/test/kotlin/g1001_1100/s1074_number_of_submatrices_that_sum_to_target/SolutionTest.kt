package g1001_1100.s1074_number_of_submatrices_that_sum_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSubmatrixSumTarget() {
        assertThat(
            Solution()
                .numSubmatrixSumTarget(arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 1, 1), intArrayOf(0, 1, 0)), 0),
            equalTo(4),
        )
    }

    @Test
    fun numSubmatrixSumTarget2() {
        assertThat(
            Solution().numSubmatrixSumTarget(arrayOf(intArrayOf(1, -1), intArrayOf(-1, 1)), 0),
            equalTo(5),
        )
    }
}
