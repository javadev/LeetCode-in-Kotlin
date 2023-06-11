package g1501_1600.s1542_find_longest_awesome_substring

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestAwesome() {
        MatcherAssert.assertThat(Solution().longestAwesome("3242415"), CoreMatchers.equalTo(5))
    }

    @Test
    fun longestAwesome2() {
        MatcherAssert.assertThat(Solution().longestAwesome("12345678"), CoreMatchers.equalTo(1))
    }

    @Test
    fun longestAwesome3() {
        MatcherAssert.assertThat(Solution().longestAwesome("213123"), CoreMatchers.equalTo(6))
    }
}
