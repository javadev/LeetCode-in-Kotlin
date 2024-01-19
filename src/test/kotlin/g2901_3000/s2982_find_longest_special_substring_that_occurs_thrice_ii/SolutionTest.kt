package g2901_3000.s2982_find_longest_special_substring_that_occurs_thrice_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumLength() {
        assertThat(Solution().maximumLength("aaaa"), equalTo(2))
    }

    @Test
    fun maximumLength2() {
        assertThat(Solution().maximumLength("abcdef"), equalTo(-1))
    }

    @Test
    fun maximumLength3() {
        assertThat(Solution().maximumLength("abcaba"), equalTo(1))
    }
}
