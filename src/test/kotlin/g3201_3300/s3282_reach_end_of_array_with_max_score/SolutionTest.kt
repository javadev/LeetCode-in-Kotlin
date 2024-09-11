package g3201_3300.s3282_reach_end_of_array_with_max_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaximumScore() {
        assertThat<Long?>(
            Solution().findMaximumScore(mutableListOf<Int>(1, 3, 1, 5)),
            equalTo<Long?>(7L)
        )
    }

    @Test
    fun findMaximumScore2() {
        assertThat<Long?>(
            Solution().findMaximumScore(mutableListOf<Int>(4, 3, 1, 3, 2)),
            equalTo<Long?>(16L)
        )
    }
}
