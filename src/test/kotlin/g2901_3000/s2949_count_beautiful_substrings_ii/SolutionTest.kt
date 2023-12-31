package g2901_3000.s2949_count_beautiful_substrings_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulSubstrings() {
        assertThat(Solution().beautifulSubstrings("baeyh", 2), equalTo(2L))
    }

    @Test
    fun beautifulSubstrings2() {
        assertThat(Solution().beautifulSubstrings("abba", 1), equalTo(3L))
    }

    @Test
    fun beautifulSubstrings3() {
        assertThat(Solution().beautifulSubstrings("bcdf", 1), equalTo(0L))
    }
}
