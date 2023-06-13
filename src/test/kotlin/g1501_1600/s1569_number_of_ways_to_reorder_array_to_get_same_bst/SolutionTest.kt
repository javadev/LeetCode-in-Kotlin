package g1501_1600.s1569_number_of_ways_to_reorder_array_to_get_same_bst

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfWays() {
        MatcherAssert.assertThat(Solution().numOfWays(intArrayOf(2, 1, 3)), CoreMatchers.equalTo(1))
    }

    @Test
    fun numOfWays2() {
        MatcherAssert.assertThat(Solution().numOfWays(intArrayOf(3, 4, 5, 1, 2)), CoreMatchers.equalTo(5))
    }

    @Test
    fun numOfWays3() {
        MatcherAssert.assertThat(Solution().numOfWays(intArrayOf(1, 2, 3)), CoreMatchers.equalTo(0))
    }
}
