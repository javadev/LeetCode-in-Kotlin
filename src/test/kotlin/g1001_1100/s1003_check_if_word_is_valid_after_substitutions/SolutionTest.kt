package g1001_1100.s1003_check_if_word_is_valid_after_substitutions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isValid() {
        assertThat(Solution().isValid("aabcbc"), equalTo(true))
    }

    @Test
    fun isValid2() {
        assertThat(Solution().isValid("abcabcababcc"), equalTo(true))
    }

    @Test
    fun isValid3() {
        assertThat(Solution().isValid("abccba"), equalTo(false))
    }
}
