package g1801_1900.s1864_minimum_number_of_swaps_to_make_the_binary_string_alternating

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat(Solution().minSwaps("111000"), equalTo(1))
    }

    @Test
    fun minSwaps2() {
        assertThat(Solution().minSwaps("010"), equalTo(0))
    }

    @Test
    fun minSwaps3() {
        assertThat(Solution().minSwaps("1110"), equalTo(-1))
    }
}
