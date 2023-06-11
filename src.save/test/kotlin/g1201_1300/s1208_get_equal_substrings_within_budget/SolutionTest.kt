package g1201_1300.s1208_get_equal_substrings_within_budget

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun equalSubstring() {
        MatcherAssert.assertThat(Solution().equalSubstring("abcd", "bcdf", 3), CoreMatchers.equalTo(3))
    }

    @Test
    fun equalSubstring2() {
        MatcherAssert.assertThat(Solution().equalSubstring("abcd", "cdef", 3), CoreMatchers.equalTo(1))
    }

    @Test
    fun equalSubstring3() {
        MatcherAssert.assertThat(Solution().equalSubstring("abcd", "acde", 0), CoreMatchers.equalTo(1))
    }
}
