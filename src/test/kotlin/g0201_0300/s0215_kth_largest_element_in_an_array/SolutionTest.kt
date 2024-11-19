package g0201_0300.s0215_kth_largest_element_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthLargest() {
        assertThat(Solution().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2), equalTo(5))
    }

    @Test
    fun findKthLargest2() {
        assertThat(
            Solution().findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4),
            equalTo(4),
        )
    }
}
