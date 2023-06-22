package g2001_2100.s2049_count_nodes_with_the_highest_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countHighestScoreNodes() {
        assertThat(Solution().countHighestScoreNodes(intArrayOf(-1, 2, 0, 2, 0)), equalTo(3))
    }

    @Test
    fun countHighestScoreNodes2() {
        assertThat(Solution().countHighestScoreNodes(intArrayOf(-1, 2, 0)), equalTo(2))
    }
}
