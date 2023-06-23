package g1801_1900.s1850_minimum_adjacent_swaps_to_reach_the_kth_smallest_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        assertThat(Solution().getMinSwaps("5489355142", 4), equalTo(2))
    }

    @Test
    fun minSwaps2() {
        assertThat(Solution().getMinSwaps("11112", 4), equalTo(4))
    }

    @Test
    fun minSwaps3() {
        assertThat(Solution().getMinSwaps("00123", 1), equalTo(1))
    }
}
