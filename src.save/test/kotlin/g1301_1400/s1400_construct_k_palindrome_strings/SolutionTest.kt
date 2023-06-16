package g1301_1400.s1400_construct_k_palindrome_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canConstruct() {
        assertThat(Solution().canConstruct("annabelle", 2), equalTo(true))
    }

    @Test
    fun canConstruct2() {
        assertThat(Solution().canConstruct("leetcode", 3), equalTo(false))
    }

    @Test
    fun canConstruct3() {
        assertThat(Solution().canConstruct("true", 4), equalTo(true))
    }
}
