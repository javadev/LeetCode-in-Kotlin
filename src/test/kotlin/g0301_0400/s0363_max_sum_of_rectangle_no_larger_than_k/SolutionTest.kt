package g0301_0400.s0363_max_sum_of_rectangle_no_larger_than_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumSubmatrix() {
        assertThat(
            Solution().maxSumSubmatrix(arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, -2, 3)), 2), equalTo(2)
        )
    }

    @Test
    fun maxSumSubmatrix2() {
        assertThat(Solution().maxSumSubmatrix(arrayOf(intArrayOf(2, 2, -1)), 3), equalTo(3))
    }
}
