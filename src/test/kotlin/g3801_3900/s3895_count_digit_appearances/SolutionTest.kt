package g3801_3900.s3895_count_digit_appearances

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDigitOccurrences() {
        assertThat<Int>(
            Solution().countDigitOccurrences(intArrayOf(12, 54, 32, 22), 2),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countDigitOccurrences2() {
        assertThat<Int>(
            Solution().countDigitOccurrences(intArrayOf(1, 34, 7), 9),
            equalTo<Int>(0),
        )
    }
}
