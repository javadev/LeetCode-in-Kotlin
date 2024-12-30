package g3301_3400.s3395_subsequences_with_a_unique_middle_mode_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subsequencesWithMiddleMode() {
        assertThat<Int>(
            Solution().subsequencesWithMiddleMode(intArrayOf(1, 1, 1, 1, 1, 1)),
            equalTo<Int>(6),
        )
    }

    @Test
    fun subsequencesWithMiddleMode2() {
        assertThat<Int>(
            Solution().subsequencesWithMiddleMode(intArrayOf(1, 2, 2, 3, 3, 4)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun subsequencesWithMiddleMode3() {
        assertThat<Int>(
            Solution().subsequencesWithMiddleMode(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8)),
            equalTo<Int>(0),
        )
    }
}
