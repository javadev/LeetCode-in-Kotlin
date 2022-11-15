package g0301_0400.s0332_reconstruct_itinerary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun findItinerary() {
        val input = Arrays.asList(
            Arrays.asList("MUC", "LHR"),
            Arrays.asList("JFK", "MUC"),
            Arrays.asList("SFO", "SJC"),
            Arrays.asList("LHR", "SFO")
        )
        assertThat(
            Solution().findItinerary(input),
            equalTo(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"))
        )
    }

    @Test
    fun findItinerary2() {
        val input = Arrays.asList(
            Arrays.asList("JFK", "SFO"),
            Arrays.asList("JFK", "ATL"),
            Arrays.asList("SFO", "ATL"),
            Arrays.asList("ATL", "JFK"),
            Arrays.asList("ATL", "SFO")
        )
        assertThat(
            Solution().findItinerary(input),
            equalTo(Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"))
        )
    }
}
