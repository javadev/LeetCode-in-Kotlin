package g1901_2000.s1963_minimum_number_of_swaps_to_make_the_string_balanced

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat(Solution().minSwaps("][]["), equalTo(1))
    }

    @Test
    fun minSwaps2() {
        assertThat(Solution().minSwaps("]]][[["), equalTo(2))
    }

    @Test
    fun minSwaps3() {
        assertThat(Solution().minSwaps("[]"), equalTo(0))
    }
}
