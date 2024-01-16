package g2901_3000.s2953_count_complete_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCompleteSubstrings() {
        assertThat(Solution().countCompleteSubstrings("igigee", 2), equalTo(3))
    }

    @Test
    fun countCompleteSubstrings2() {
        assertThat(Solution().countCompleteSubstrings("aaabbbccc", 3), equalTo(6))
    }
}
