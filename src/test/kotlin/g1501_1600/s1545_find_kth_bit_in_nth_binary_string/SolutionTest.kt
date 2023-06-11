package g1501_1600.s1545_find_kth_bit_in_nth_binary_string

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthBit() {
        MatcherAssert.assertThat(Solution().findKthBit(3, 1), CoreMatchers.equalTo('0'))
    }

    @Test
    fun findKthBit2() {
        MatcherAssert.assertThat(Solution().findKthBit(4, 11), CoreMatchers.equalTo('1'))
    }
}
