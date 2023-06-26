package g2001_2100.s2068_check_whether_two_strings_are_almost_equivalent

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkAlmostEquivalent() {
        assertThat(Solution().checkAlmostEquivalent("aaaa", "bccb"), equalTo(false))
    }

    @Test
    fun checkAlmostEquivalent2() {
        assertThat(Solution().checkAlmostEquivalent("abcdeef", "abaaacc"), equalTo(true))
    }

    @Test
    fun checkAlmostEquivalent3() {
        assertThat(Solution().checkAlmostEquivalent("cccddabba", "babababab"), equalTo(true))
    }
}
