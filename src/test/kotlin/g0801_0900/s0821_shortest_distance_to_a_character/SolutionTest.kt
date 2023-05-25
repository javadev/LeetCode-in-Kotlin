package g0801_0900.s0821_shortest_distance_to_a_character

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestToChar() {
        assertThat(
            Solution().shortestToChar("loveleetcode", 'e'),
            equalTo(intArrayOf(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0))
        )
    }

    @Test
    fun shortestToChar2() {
        assertThat(Solution().shortestToChar("aaab", 'b'), equalTo(intArrayOf(3, 2, 1, 0)))
    }
}
