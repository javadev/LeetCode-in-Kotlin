package g2601_2700.s2607_make_k_subarray_sums_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeSubKSumEqual() {
        assertThat(Solution().makeSubKSumEqual(intArrayOf(1, 4, 1, 3), 2), equalTo(1))
    }

    @Test
    fun makeSubKSumEqual2() {
        assertThat(Solution().makeSubKSumEqual(intArrayOf(2, 5, 5, 7), 3), equalTo(5))
    }
}
