package g1101_1200.s1190_reverse_substrings_between_each_pair_of_parentheses

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseParentheses() {
        MatcherAssert.assertThat(Solution().reverseParentheses("(abcd)"), CoreMatchers.equalTo("dcba"))
    }

    @Test
    fun reverseParentheses2() {
        MatcherAssert.assertThat(Solution().reverseParentheses("(u(love)i)"), CoreMatchers.equalTo("iloveu"))
    }

    @Test
    fun reverseParentheses3() {
        MatcherAssert.assertThat(Solution().reverseParentheses("(ed(et(oc))el)"), CoreMatchers.equalTo("leetcode"))
    }
}
