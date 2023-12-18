package g2801_2900.s2856_minimum_array_length_after_pair_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minLengthAfterRemovals() {
        assertThat(Solution().minLengthAfterRemovals(mutableListOf(1, 3, 4, 9)), equalTo(0))
    }

    @Test
    fun minLengthAfterRemovals2() {
        assertThat(Solution().minLengthAfterRemovals(mutableListOf(2, 3, 6, 9)), equalTo(0))
    }

    @Test
    fun minLengthAfterRemovals3() {
        assertThat(Solution().minLengthAfterRemovals(mutableListOf(1, 1, 2)), equalTo(1))
    }
}
