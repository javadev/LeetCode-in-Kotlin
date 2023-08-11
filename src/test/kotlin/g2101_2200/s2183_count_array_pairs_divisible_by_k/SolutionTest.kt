package g2101_2200.s2183_count_array_pairs_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(Solution().countPairs(intArrayOf(1, 2, 3, 4, 5), 2), equalTo(7L))
    }

    @Test
    fun countPairs2() {
        assertThat(Solution().countPairs(intArrayOf(1, 2, 3, 4), 5), equalTo(0L))
    }
}
