package g1301_1400.s1395_count_number_of_teams

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numTeams() {
        assertThat(Solution().numTeams(intArrayOf(2, 5, 3, 4, 1)), equalTo(3))
    }

    @Test
    fun numTeams2() {
        assertThat(Solution().numTeams(intArrayOf(2, 1, 3)), equalTo(0))
    }

    @Test
    fun numTeams3() {
        assertThat(Solution().numTeams(intArrayOf(1, 2, 3, 4)), equalTo(4))
    }
}
