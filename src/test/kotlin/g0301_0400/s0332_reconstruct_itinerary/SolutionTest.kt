package g0301_0400.s0332_reconstruct_itinerary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findItinerary() {
        val input = listOf(
            listOf("MUC", "LHR"),
            listOf("JFK", "MUC"),
            listOf("SFO", "SJC"),
            listOf("LHR", "SFO")
        )
        assertThat(
            Solution().findItinerary(input),
            equalTo(listOf("JFK", "MUC", "LHR", "SFO", "SJC"))
        )
    }

    @Test
    fun findItinerary2() {
        val input = listOf(
            listOf("JFK", "SFO"),
            listOf("JFK", "ATL"),
            listOf("SFO", "ATL"),
            listOf("ATL", "JFK"),
            listOf("ATL", "SFO")
        )
        assertThat(
            Solution().findItinerary(input),
            equalTo(listOf("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"))
        )
    }
}
