package g0601_0700.s0649_dota2_senate

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun predictPartyVictory() {
        assertThat(Solution().predictPartyVictory("RD"), equalTo("Radiant"))
    }

    @Test
    fun predictPartyVictory2() {
        assertThat(Solution().predictPartyVictory("RDD"), equalTo("Dire"))
    }
}
