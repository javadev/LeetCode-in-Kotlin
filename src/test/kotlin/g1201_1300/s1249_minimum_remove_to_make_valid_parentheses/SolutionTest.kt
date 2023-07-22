package g1201_1300.s1249_minimum_remove_to_make_valid_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minRemoveToMakeValid() {
        assertThat(Solution().minRemoveToMakeValid("lee(t(c)o)de)"), equalTo("lee(t(c)o)de"))
    }

    @Test
    fun minRemoveToMakeValid2() {
        assertThat(Solution().minRemoveToMakeValid("a)b(c)d"), equalTo("ab(c)d"))
    }

    @Test
    fun minRemoveToMakeValid3() {
        assertThat(Solution().minRemoveToMakeValid("))(("), equalTo(""))
    }
}
