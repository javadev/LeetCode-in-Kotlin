package g2701_2800.s2800_shortest_string_that_contains_three_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumString() {
        assertThat(Solution().minimumString("abc", "bca", "aaa"), equalTo("aaabca"))
    }

    @Test
    fun minimumString2() {
        assertThat(Solution().minimumString("ab", "ba", "aba"), equalTo("aba"))
    }
}
