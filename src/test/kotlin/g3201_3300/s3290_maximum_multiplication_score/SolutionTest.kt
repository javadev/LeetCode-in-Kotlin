package g3201_3300.s3290_maximum_multiplication_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat<Long>(
            Solution()
                .maxScore(intArrayOf(3, 2, 5, 6), intArrayOf(2, -6, 4, -5, -3, 2, -7)),
            equalTo<Long>(26L),
        )
    }

    @Test
    fun maxScore2() {
        assertThat<Long>(
            Solution().maxScore(intArrayOf(-1, 4, 5, -2), intArrayOf(-5, -1, -3, -2, -4)),
            equalTo<Long>(-1L),
        )
    }
}
