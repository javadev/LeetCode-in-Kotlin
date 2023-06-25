package g2101_2200.s2155_all_divisions_with_the_highest_score_of_a_binary_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScoreIndices() {
        MatcherAssert.assertThat(
            Solution().maxScoreIndices(intArrayOf(0, 0, 1, 0)),
            CoreMatchers.equalTo(mutableListOf(2, 4))
        )
    }

    @Test
    fun maxScoreIndices2() {
        MatcherAssert.assertThat(
            Solution().maxScoreIndices(intArrayOf(0, 0, 0)),
            CoreMatchers.equalTo(mutableListOf(3))
        )
    }

    @Test
    fun maxScoreIndices3() {
        MatcherAssert.assertThat(Solution().maxScoreIndices(intArrayOf(1, 1)), CoreMatchers.equalTo(mutableListOf(0)))
    }
}
