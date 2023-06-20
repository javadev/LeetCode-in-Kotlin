package g1901_2000.s1957_delete_characters_to_make_fancy_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeFancyString() {
        assertThat(Solution().makeFancyString("leeetcode"), equalTo("leetcode"))
    }

    @Test
    fun makeFancyString2() {
        assertThat(Solution().makeFancyString("aaabaaaa"), equalTo("aabaa"))
    }

    @Test
    fun makeFancyString3() {
        assertThat(Solution().makeFancyString("aab"), equalTo("aab"))
    }
}
