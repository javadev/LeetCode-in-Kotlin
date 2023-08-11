package g2301_2400.s2360_longest_cycle_in_a_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestCycle() {
        assertThat(Solution().longestCycle(intArrayOf(3, 3, 4, 2, 3)), equalTo(3))
    }

    @Test
    fun longestCycle2() {
        assertThat(Solution().longestCycle(intArrayOf(2, -1, 3, 1)), equalTo(-1))
    }
}
