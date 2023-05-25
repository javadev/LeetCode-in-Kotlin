package g1101_1200.s1190_reverse_substrings_between_each_pair_of_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseParentheses() {
        assertThat(Solution().reverseParentheses("(abcd)"), equalTo("dcba"))
    }

    @Test
    fun reverseParentheses2() {
        assertThat(Solution().reverseParentheses("(u(love)i)"), equalTo("iloveu"))
    }

    @Test
    fun reverseParentheses3() {
        assertThat(Solution().reverseParentheses("(ed(et(oc))el)"), equalTo("leetcode"))
    }
}
