package g3401_3500.s3449_maximize_the_minimum_game_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Long>(Solution().maxScore(intArrayOf(2, 4), 3), equalTo<Long>(4L))
    }

    @Test
    fun maxScore2() {
        assertThat<Long>(Solution().maxScore(intArrayOf(1, 2, 3), 5), equalTo<Long>(2L))
    }

    @Test
    fun maxScore3() {
        assertThat<Long>(Solution().maxScore(intArrayOf(1, 2, 3), 2), equalTo<Long>(0L))
    }
}
