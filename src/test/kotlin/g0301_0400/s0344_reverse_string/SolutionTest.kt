package g0301_0400.s0344_reverse_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseString() {
        val input = charArrayOf('h', 'e', 'l', 'l', 'o')
        val output = charArrayOf('o', 'l', 'l', 'e', 'h')
        Solution().reverseString(input)
        assertThat(input, equalTo(output))
    }

    @Test
    fun reverseString2() {
        val input = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
        val output = charArrayOf('h', 'a', 'n', 'n', 'a', 'H')
        Solution().reverseString(input)
        assertThat(input, equalTo(output))
    }
}
