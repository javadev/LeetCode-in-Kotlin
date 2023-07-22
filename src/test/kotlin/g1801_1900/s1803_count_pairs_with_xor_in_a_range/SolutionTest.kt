package g1801_1900.s1803_count_pairs_with_xor_in_a_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(Solution().countPairs(intArrayOf(1, 4, 2, 7), 2, 6), equalTo(6))
    }

    @Test
    fun countPairs2() {
        assertThat(Solution().countPairs(intArrayOf(9, 8, 4, 2, 1), 5, 14), equalTo(8))
    }
}
