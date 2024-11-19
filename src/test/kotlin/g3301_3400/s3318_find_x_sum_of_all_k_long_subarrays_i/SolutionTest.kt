package g3301_3400.s3318_find_x_sum_of_all_k_long_subarrays_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findXSum() {
        assertThat<IntArray?>(
            Solution().findXSum(intArrayOf(1, 1, 2, 2, 3, 4, 2, 3), 6, 2),
            equalTo<IntArray?>(intArrayOf(6, 10, 12)),
        )
    }

    @Test
    fun findXSum2() {
        assertThat<IntArray?>(
            Solution().findXSum(intArrayOf(3, 8, 7, 8, 7, 5), 2, 2),
            equalTo<IntArray?>(intArrayOf(11, 15, 15, 15, 12)),
        )
    }
}
