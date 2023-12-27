package g2901_3000.s2904_shortest_and_lexicographically_smallest_beautiful_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestBeautifulSubstring() {
        assertThat(Solution().shortestBeautifulSubstring("100011001", 3), equalTo("11001"))
    }

    @Test
    fun shortestBeautifulSubstring2() {
        assertThat(Solution().shortestBeautifulSubstring("1011", 2), equalTo("11"))
    }

    @Test
    fun shortestBeautifulSubstring3() {
        assertThat(Solution().shortestBeautifulSubstring("000", 1), equalTo(""))
    }

    @Test
    fun shortestBeautifulSubstring4() {
        assertThat(
            Solution().shortestBeautifulSubstring("001110101101101111", 10),
            equalTo("10101101101111")
        )
    }
}
