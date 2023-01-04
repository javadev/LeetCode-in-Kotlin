package g0001_0100.s0076_minimum_window_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minWindow() {
        assertThat(Solution().minWindow("ADOBECODEBANC", "ABC"), equalTo("BANC"))
    }

    @Test
    fun minWindow2() {
        assertThat(Solution().minWindow("a", "a"), equalTo("a"))
    }

    @Test
    fun minWindow3() {
        assertThat(Solution().minWindow("a", "aa"), equalTo(""))
    }
}
