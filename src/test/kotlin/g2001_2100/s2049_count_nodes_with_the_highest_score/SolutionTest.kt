package g2001_2100.s2049_count_nodes_with_the_highest_score

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countHighestScoreNodes() {
        MatcherAssert.assertThat(Solution().countHighestScoreNodes(intArrayOf(-1, 2, 0, 2, 0)), CoreMatchers.equalTo(3))
    }

    @Test
    fun countHighestScoreNodes2() {
        MatcherAssert.assertThat(Solution().countHighestScoreNodes(intArrayOf(-1, 2, 0)), CoreMatchers.equalTo(2))
    }
}
