package g3801_3900.s3836_maximum_score_using_exactly_k_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Long>(
            Solution().maxScore(intArrayOf(1, 3, 2), intArrayOf(4, 5, 1), 2),
            equalTo<Long>(22L),
        )
    }

    @Test
    fun maxScore2() {
        assertThat<Long>(
            Solution().maxScore(intArrayOf(-2, 0, 5), intArrayOf(-3, 4, -1, 2), 2),
            equalTo<Long>(26L),
        )
    }

    @Test
    fun maxScore3() {
        assertThat<Long>(
            Solution().maxScore(intArrayOf(-3, -2), intArrayOf(1, 2), 2),
            equalTo<Long>(-7L),
        )
    }
}
