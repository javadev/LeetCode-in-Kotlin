package g2101_2200.s2176_count_equal_and_divisible_pairs_in_an_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        MatcherAssert.assertThat(Solution().countPairs(intArrayOf(3, 1, 2, 2, 2, 1, 3), 2), CoreMatchers.equalTo(4))
    }

    @Test
    fun countPairs2() {
        MatcherAssert.assertThat(Solution().countPairs(intArrayOf(1, 2, 3, 4), 1), CoreMatchers.equalTo(0))
    }
}
