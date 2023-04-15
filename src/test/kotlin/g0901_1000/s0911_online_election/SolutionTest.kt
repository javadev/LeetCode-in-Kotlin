package g0901_1000.s0911_online_election

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun topVotedCandidateTest() {
        val topVotedCandidate = TopVotedCandidate(intArrayOf(0, 1, 1, 0, 0, 1, 0), intArrayOf(0, 5, 10, 15, 20, 25, 30))
        assertThat(topVotedCandidate.q(3), equalTo(0))
        assertThat(topVotedCandidate.q(12), equalTo(1))
        assertThat(topVotedCandidate.q(25), equalTo(1))
        assertThat(topVotedCandidate.q(15), equalTo(0))
        assertThat(topVotedCandidate.q(24), equalTo(0))
        assertThat(topVotedCandidate.q(8), equalTo(1))
    }
}
