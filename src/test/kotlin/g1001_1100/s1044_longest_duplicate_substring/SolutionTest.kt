package g1001_1100.s1044_longest_duplicate_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestDupSubstring() {
        assertThat(Solution().longestDupSubstring("banana"), equalTo("ana"))
    }

    @Test
    fun longestDupSubstring2() {
        assertThat(Solution().longestDupSubstring("abcd"), equalTo(""))
    }
}
