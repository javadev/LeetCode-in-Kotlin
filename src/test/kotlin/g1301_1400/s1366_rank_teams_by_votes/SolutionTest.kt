package g1301_1400.s1366_rank_teams_by_votes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rankTeams() {
        assertThat(
            Solution().rankTeams(arrayOf("ABC", "ACB", "ABC", "ACB", "ACB")),
            equalTo("ACB"),
        )
    }

    @Test
    fun rankTeams2() {
        assertThat(Solution().rankTeams(arrayOf("WXYZ", "XYZW")), equalTo("XWYZ"))
    }

    @Test
    fun rankTeams3() {
        assertThat(
            Solution().rankTeams(arrayOf("ZMNAGUEDSJYLBOPHRQICWFXTVK")),
            equalTo("ZMNAGUEDSJYLBOPHRQICWFXTVK"),
        )
    }
}
