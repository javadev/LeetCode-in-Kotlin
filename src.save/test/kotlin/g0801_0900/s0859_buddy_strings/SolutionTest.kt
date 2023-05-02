package g0801_0900.s0859_buddy_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun buddyStrings() {
        assertThat(Solution().buddyStrings("ab", "ba"), equalTo(true))
    }

    @Test
    fun buddyStrings2() {
        assertThat(Solution().buddyStrings("ab", "ab"), equalTo(false))
    }

    @Test
    fun buddyStrings3() {
        assertThat(Solution().buddyStrings("aa", "aa"), equalTo(true))
    }
}
