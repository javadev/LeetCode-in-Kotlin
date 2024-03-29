package g0701_0800.s0703_kth_largest_element_in_a_stream

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class KthLargestTest {
    @Test
    fun kthLargestTest() {
        val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))
        assertThat(kthLargest.add(3), equalTo(4))
        assertThat(kthLargest.add(5), equalTo(5))
        assertThat(kthLargest.add(10), equalTo(5))
        assertThat(kthLargest.add(9), equalTo(8))
        assertThat(kthLargest.add(4), equalTo(8))
    }
}
