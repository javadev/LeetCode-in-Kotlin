package g3701_3800.s3788_maximum_score_of_a_split

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat<Long>(
            Solution().maximumScore(intArrayOf(10, -1, 3, -4, -5)),
            equalTo<Long>(17L),
        )
    }

    @Test
    fun maximumScore2() {
        assertThat<Long>(
            Solution().maximumScore(intArrayOf(-7, -5, 3)),
            equalTo<Long>(-2L),
        )
    }

    @Test
    fun maximumScore3() {
        assertThat<Long>(Solution().maximumScore(intArrayOf(1, 1)), equalTo<Long>(0L))
    }
}
