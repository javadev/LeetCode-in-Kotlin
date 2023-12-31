package g2901_3000.s2947_count_beautiful_substrings_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulSubstrings() {
        assertThat(Solution().beautifulSubstrings("baeyh", 2), equalTo(2))
    }

    @Test
    fun beautifulSubstrings2() {
        assertThat(Solution().beautifulSubstrings("abba", 1), equalTo(3))
    }

    @Test
    fun beautifulSubstrings3() {
        assertThat(Solution().beautifulSubstrings("bcdf", 1), equalTo(0))
    }
}
