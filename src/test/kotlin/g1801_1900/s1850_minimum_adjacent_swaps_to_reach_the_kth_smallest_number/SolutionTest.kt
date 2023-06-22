package g1801_1900.s1850_minimum_adjacent_swaps_to_reach_the_kth_smallest_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwaps() {
        MatcherAssert.assertThat(Solution().getMinSwaps("5489355142", 4), CoreMatchers.equalTo(2))
    }

    @Test
    fun minSwaps2() {
        MatcherAssert.assertThat(Solution().getMinSwaps("11112", 4), CoreMatchers.equalTo(4))
    }

    @Test
    fun minSwaps3() {
        MatcherAssert.assertThat(Solution().getMinSwaps("00123", 1), CoreMatchers.equalTo(1))
    }
}
