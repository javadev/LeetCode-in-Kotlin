package g0001_0100.s0064_minimum_path_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPathSum() {
        assertThat(
            Solution().minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))),
            equalTo(7)
        )
    }

    @Test
    fun minPathSum2() {
        assertThat(Solution().minPathSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))), equalTo(12))
    }
}
