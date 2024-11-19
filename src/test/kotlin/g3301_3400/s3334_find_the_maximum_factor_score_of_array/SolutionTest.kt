package g3301_3400.s3334_find_the_maximum_factor_score_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Long?>(Solution().maxScore(intArrayOf(2, 4, 8, 16)), equalTo<Long?>(64L))
    }

    @Test
    fun maxScore2() {
        assertThat<Long?>(
            Solution().maxScore(intArrayOf(1, 2, 3, 4, 5)),
            equalTo<Long?>(60L),
        )
    }

    @Test
    fun maxScore3() {
        assertThat<Long?>(Solution().maxScore(intArrayOf(3)), equalTo<Long?>(9L))
    }
}
