package g1801_1900.s1814_count_nice_pairs_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countNicePairs() {
        assertThat(Solution().countNicePairs(intArrayOf(42, 11, 1, 97)), equalTo(2))
    }

    @Test
    fun countNicePairs2() {
        assertThat(Solution().countNicePairs(intArrayOf(13, 10, 35, 24, 76)), equalTo(4))
    }
}
