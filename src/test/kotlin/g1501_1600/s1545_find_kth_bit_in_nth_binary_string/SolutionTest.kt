package g1501_1600.s1545_find_kth_bit_in_nth_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthBit() {
        assertThat(Solution().findKthBit(3, 1), equalTo('0'))
    }

    @Test
    fun findKthBit2() {
        assertThat(Solution().findKthBit(4, 11), equalTo('1'))
    }
}
