package g2901_3000.s2908_minimum_sum_of_mountain_triplets_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSum() {
        assertThat(Solution().minimumSum(intArrayOf(8, 6, 1, 5, 3)), equalTo(9))
    }

    @Test
    fun minimumSum2() {
        assertThat(Solution().minimumSum(intArrayOf(5, 4, 8, 7, 10, 2)), equalTo(13))
    }

    @Test
    fun minimumSum3() {
        assertThat(Solution().minimumSum(intArrayOf(6, 5, 4, 3, 4, 5)), equalTo(-1))
    }
}
