package g0501_0600.s0541_reverse_string_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseStr() {
        assertThat(Solution().reverseStr("abcdefg", 2), equalTo("bacdfeg"))
    }

    @Test
    fun reverseStr2() {
        assertThat(Solution().reverseStr("abcd", 2), equalTo("bacd"))
    }
}
