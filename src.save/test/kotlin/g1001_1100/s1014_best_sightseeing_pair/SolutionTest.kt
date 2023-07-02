package g1001_1100.s1014_best_sightseeing_pair

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScoreSightseeingPair() {
        assertThat(Solution().maxScoreSightseeingPair(intArrayOf(8, 1, 5, 2, 6)), equalTo(11))
    }

    @Test
    fun maxScoreSightseeingPair2() {
        assertThat(Solution().maxScoreSightseeingPair(intArrayOf(1, 2)), equalTo(2))
    }
}
