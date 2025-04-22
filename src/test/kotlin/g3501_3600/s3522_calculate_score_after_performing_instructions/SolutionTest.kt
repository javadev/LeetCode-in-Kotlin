package g3501_3600.s3522_calculate_score_after_performing_instructions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun calculateScore() {
        assertThat<Long>(
            Solution()
                .calculateScore(
                    arrayOf<String>("jump", "add", "add", "jump", "add", "jump"),
                    intArrayOf(2, 1, 3, 1, -2, -3),
                ),
            equalTo<Long>(1L),
        )
    }

    @Test
    fun calculateScore2() {
        assertThat<Long>(
            Solution()
                .calculateScore(arrayOf<String>("jump", "add", "add"), intArrayOf(3, 1, 1)),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun calculateScore3() {
        assertThat<Long>(
            Solution().calculateScore(arrayOf<String>("jump"), intArrayOf(0)),
            equalTo<Long>(0L),
        )
    }
}
