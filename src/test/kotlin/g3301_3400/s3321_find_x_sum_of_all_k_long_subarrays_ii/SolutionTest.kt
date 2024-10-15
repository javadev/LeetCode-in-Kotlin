package g3301_3400.s3321_find_x_sum_of_all_k_long_subarrays_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findXSum() {
        assertThat<LongArray?>(
            Solution().findXSum(intArrayOf(1, 1, 2, 2, 3, 4, 2, 3), 6, 2),
            equalTo<LongArray?>(longArrayOf(6L, 10L, 12L))
        )
    }

    @Test
    fun findXSum2() {
        assertThat<LongArray?>(
            Solution().findXSum(intArrayOf(3, 8, 7, 8, 7, 5), 2, 2),
            equalTo<LongArray?>(longArrayOf(11L, 15L, 15L, 15L, 12L))
        )
    }
}
