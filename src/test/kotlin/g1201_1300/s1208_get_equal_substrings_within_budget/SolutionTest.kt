package g1201_1300.s1208_get_equal_substrings_within_budget

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun equalSubstring() {
        assertThat(Solution().equalSubstring("abcd", "bcdf", 3), equalTo(3))
    }

    @Test
    fun equalSubstring2() {
        assertThat(Solution().equalSubstring("abcd", "cdef", 3), equalTo(1))
    }

    @Test
    fun equalSubstring3() {
        assertThat(Solution().equalSubstring("abcd", "acde", 0), equalTo(1))
    }
}
