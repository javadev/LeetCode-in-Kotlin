package g1301_1400.s1301_number_of_paths_with_max_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pathsWithMaxScore() {
        assertThat(
            Solution().pathsWithMaxScore(mutableListOf("E23", "2X2", "12S")),
            equalTo(intArrayOf(7, 1))
        )
    }

    @Test
    fun pathsWithMaxScore2() {
        assertThat(
            Solution().pathsWithMaxScore(mutableListOf("E12", "1X1", "21S")),
            equalTo(intArrayOf(4, 2))
        )
    }

    @Test
    fun pathsWithMaxScore3() {
        assertThat(
            Solution().pathsWithMaxScore(mutableListOf("E11", "XXX", "11S")),
            equalTo(intArrayOf(0, 0))
        )
    }
}
