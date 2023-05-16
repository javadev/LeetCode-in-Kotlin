package g1001_1100.s1010_pairs_of_songs_with_total_durations_divisible_by_60

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numPairsDivisibleBy60() {
        assertThat(
            Solution().numPairsDivisibleBy60(intArrayOf(30, 20, 150, 100, 40)), equalTo(3)
        )
    }

    @Test
    fun numPairsDivisibleBy602() {
        assertThat(Solution().numPairsDivisibleBy60(intArrayOf(60, 60, 60)), equalTo(3))
    }
}
