package g1601_1700.s1688_count_of_matches_in_tournament

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfMatches() {
        assertThat(Solution().numberOfMatches(7), equalTo(6))
    }

    @Test
    fun numberOfMatches2() {
        assertThat(Solution().numberOfMatches(14), equalTo(13))
    }
}
