package g1501_1600.s1578_minimum_time_to_make_rope_colorful

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        MatcherAssert.assertThat(Solution().minCost("abaac", intArrayOf(1, 2, 3, 4, 5)), CoreMatchers.equalTo(3))
    }

    @Test
    fun minCost2() {
        MatcherAssert.assertThat(Solution().minCost("abc", intArrayOf(1, 2, 3)), CoreMatchers.equalTo(0))
    }

    @Test
    fun minCost3() {
        MatcherAssert.assertThat(Solution().minCost("aabaa", intArrayOf(1, 2, 3, 4, 1)), CoreMatchers.equalTo(2))
    }
}
