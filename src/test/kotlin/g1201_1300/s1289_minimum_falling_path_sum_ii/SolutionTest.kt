package g1201_1300.s1289_minimum_falling_path_sum_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minFallingPathSum() {
        assertThat(
            Solution().minFallingPathSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            equalTo(13),
        )
    }

    @Test
    fun minFallingPathSum2() {
        assertThat(Solution().minFallingPathSum(arrayOf(intArrayOf(7))), equalTo(7))
    }
}
