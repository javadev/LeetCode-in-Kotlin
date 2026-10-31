package g3701_3800.s3771_total_score_of_dungeon_runs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalScore() {
        assertThat<Long>(
            Solution().totalScore(11, intArrayOf(3, 6, 7), intArrayOf(4, 2, 5)),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun totalScore2() {
        assertThat<Long>(
            Solution().totalScore(2, intArrayOf(10000, 1), intArrayOf(1, 1)),
            equalTo<Long>(1L),
        )
    }
}
