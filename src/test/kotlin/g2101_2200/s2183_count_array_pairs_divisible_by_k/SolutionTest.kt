package g2101_2200.s2183_count_array_pairs_divisible_by_k

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        MatcherAssert.assertThat(Solution().countPairs(intArrayOf(1, 2, 3, 4, 5), 2), CoreMatchers.equalTo(7L))
    }

    @Test
    fun countPairs2() {
        MatcherAssert.assertThat(Solution().countPairs(intArrayOf(1, 2, 3, 4), 5), CoreMatchers.equalTo(0L))
    }
}
