package g1501_1600.s1505_minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInteger() {
        MatcherAssert.assertThat(Solution().minInteger("4321", 4), CoreMatchers.equalTo("1342"))
    }

    @Test
    fun minInteger2() {
        MatcherAssert.assertThat(Solution().minInteger("100", 1), CoreMatchers.equalTo("010"))
    }

    @Test
    fun minInteger3() {
        MatcherAssert.assertThat(Solution().minInteger("36789", 1000), CoreMatchers.equalTo("36789"))
    }
}
