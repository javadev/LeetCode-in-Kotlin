package g2501_2600.s2501_longest_square_streak_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSquareStreak() {
        assertThat(Solution().longestSquareStreak(intArrayOf(4, 3, 6, 16, 8, 2)), equalTo(3))
    }

    @Test
    fun longestSquareStreak2() {
        assertThat(Solution().longestSquareStreak(intArrayOf(2, 3, 5, 6, 7)), equalTo(-1))
    }
}
