package g2901_3000.s2953_count_complete_substrings

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCompleteSubstrings() {
        MatcherAssert.assertThat(Solution().countCompleteSubstrings("igigee", 2), CoreMatchers.equalTo(3))
    }

    @Test
    fun countCompleteSubstrings2() {
        MatcherAssert.assertThat(Solution().countCompleteSubstrings("aaabbbccc", 3), CoreMatchers.equalTo(6))
    }
}
