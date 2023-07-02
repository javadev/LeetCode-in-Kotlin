package g2301_2400.s2370_longest_ideal_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestIdealString() {
        assertThat(Solution().longestIdealString("acfgbd", 2), equalTo(4))
    }

    @Test
    fun longestIdealString2() {
        assertThat(Solution().longestIdealString("abcd", 3), equalTo(4))
    }
}
