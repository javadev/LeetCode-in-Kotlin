package g0901_1000.s0931_minimum_falling_path_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFallingPathSum() {
        assertThat(
            Solution().minFallingPathSum(arrayOf(intArrayOf(2, 1, 3), intArrayOf(6, 5, 4), intArrayOf(7, 8, 9))),
            equalTo(13)
        )
    }

    @Test
    fun minFallingPathSum2() {
        assertThat(
            Solution().minFallingPathSum(arrayOf(intArrayOf(-19, 57), intArrayOf(-40, -5))), equalTo(-59)
        )
    }
}
