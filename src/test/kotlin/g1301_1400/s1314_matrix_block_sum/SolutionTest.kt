package g1301_1400.s1314_matrix_block_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matrixBlockSum() {
        assertThat(
            Solution().matrixBlockSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 1),
            equalTo(arrayOf(intArrayOf(12, 21, 16), intArrayOf(27, 45, 33), intArrayOf(24, 39, 28))),
        )
    }

    @Test
    fun matrixBlockSum2() {
        assertThat(
            Solution().matrixBlockSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)), 2),
            equalTo(arrayOf(intArrayOf(45, 45, 45), intArrayOf(45, 45, 45), intArrayOf(45, 45, 45))),
        )
    }
}
