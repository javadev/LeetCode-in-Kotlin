package g1501_1600.s1542_find_longest_awesome_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestAwesome() {
        assertThat(Solution().longestAwesome("3242415"), equalTo(5))
    }

    @Test
    fun longestAwesome2() {
        assertThat(Solution().longestAwesome("12345678"), equalTo(1))
    }

    @Test
    fun longestAwesome3() {
        assertThat(Solution().longestAwesome("213123"), equalTo(6))
    }
}
