package g1501_1600.s1578_minimum_time_to_make_rope_colorful

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(Solution().minCost("abaac", intArrayOf(1, 2, 3, 4, 5)), equalTo(3))
    }

    @Test
    fun minCost2() {
        assertThat(Solution().minCost("abc", intArrayOf(1, 2, 3)), equalTo(0))
    }

    @Test
    fun minCost3() {
        assertThat(Solution().minCost("aabaa", intArrayOf(1, 2, 3, 4, 1)), equalTo(2))
    }
}
