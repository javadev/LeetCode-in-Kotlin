package g2301_2400.s2374_node_with_highest_edge_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun edgeScore() {
        assertThat(Solution().edgeScore(intArrayOf(1, 0, 0, 0, 0, 7, 7, 5)), equalTo(7))
    }

    @Test
    fun edgeScore2() {
        assertThat(Solution().edgeScore(intArrayOf(2, 0, 0, 2)), equalTo(0))
    }
}
