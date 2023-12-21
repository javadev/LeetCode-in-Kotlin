package g2801_2900.s2824_count_pairs_whose_sum_is_less_than_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(Solution().countPairs(listOf(-1, 1, 2, 3, 1), 2), equalTo(3))
    }

    @Test
    fun countPairs2() {
        assertThat(
            Solution().countPairs(listOf(-6, 2, 5, -2, -7, -1, 3), -2), equalTo(10)
        )
    }
}
