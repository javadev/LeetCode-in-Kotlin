package g1401_1500.s1405_longest_happy_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestDiverseString() {
        assertThat(Solution().longestDiverseString(1, 1, 7), equalTo("ccbccacc"))
    }

    @Test
    fun longestDiverseString2() {
        assertThat(Solution().longestDiverseString(7, 1, 0), equalTo("aabaa"))
    }
}
