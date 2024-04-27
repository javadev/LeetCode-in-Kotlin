package g3101_3200.s3116_kth_smallest_amount_with_single_denomination_combination

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthSmallest() {
        assertThat(Solution().findKthSmallest(intArrayOf(3, 6, 9), 3), equalTo(9L))
    }

    @Test
    fun findKthSmallest2() {
        assertThat(Solution().findKthSmallest(intArrayOf(5, 2), 7), equalTo(12L))
    }
}
