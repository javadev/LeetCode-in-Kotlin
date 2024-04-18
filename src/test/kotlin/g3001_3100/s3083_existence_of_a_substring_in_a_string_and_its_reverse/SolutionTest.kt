package g3001_3100.s3083_existence_of_a_substring_in_a_string_and_its_reverse

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSubstringPresent() {
        assertThat(Solution().isSubstringPresent("leetcode"), equalTo(true))
    }

    @Test
    fun isSubstringPresent2() {
        assertThat(Solution().isSubstringPresent("abcba"), equalTo(true))
    }

    @Test
    fun isSubstringPresent3() {
        assertThat(Solution().isSubstringPresent("abcd"), equalTo(false))
    }
}
