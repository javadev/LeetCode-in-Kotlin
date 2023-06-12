package g1501_1600.s1505_minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInteger() {
        assertThat(Solution().minInteger("4321", 4), equalTo("1342"))
    }

    @Test
    fun minInteger2() {
        assertThat(Solution().minInteger("100", 1), equalTo("010"))
    }

    @Test
    fun minInteger3() {
        assertThat(Solution().minInteger("36789", 1000), equalTo("36789"))
    }
}
