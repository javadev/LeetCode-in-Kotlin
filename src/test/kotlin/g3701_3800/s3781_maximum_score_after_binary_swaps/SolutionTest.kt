package g3701_3800.s3781_maximum_score_after_binary_swaps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat<Long>(
            Solution().maximumScore(intArrayOf(2, 1, 5, 2, 3), "01010"),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maximumScore2() {
        assertThat<Long>(
            Solution().maximumScore(intArrayOf(4, 7, 2, 9), "0000"),
            equalTo<Long>(0L),
        )
    }
}
