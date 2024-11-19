package g2601_2700.s2653_sliding_subarray_beauty

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getSubarrayBeauty() {
        assertThat(
            Solution().getSubarrayBeauty(intArrayOf(1, -1, -3, -2, 3), 3, 2),
            equalTo(intArrayOf(-1, -2, -2)),
        )
    }

    @Test
    fun getSubarrayBeauty2() {
        assertThat(
            Solution().getSubarrayBeauty(intArrayOf(-1, -2, -3, -4, -5), 2, 2),
            equalTo(intArrayOf(-1, -2, -3, -4)),
        )
    }

    @Test
    fun getSubarrayBeauty3() {
        assertThat(
            Solution().getSubarrayBeauty(intArrayOf(-3, 1, 2, -3, 0, -3), 2, 1),
            equalTo(intArrayOf(-3, 0, -3, -3, -3)),
        )
    }
}
