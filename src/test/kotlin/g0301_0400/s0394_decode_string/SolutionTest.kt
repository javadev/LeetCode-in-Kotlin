package g0301_0400.s0394_decode_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decodeString() {
        assertThat(Solution().decodeString("3[a]2[bc]"), equalTo("aaabcbc"))
    }

    @Test
    fun decodeString2() {
        assertThat(Solution().decodeString("3[a2[c]]"), equalTo("accaccacc"))
    }

    @Test
    fun decodeString3() {
        assertThat(Solution().decodeString("2[abc]3[cd]ef"), equalTo("abcabccdcdcdef"))
    }

    @Test
    fun decodeString4() {
        assertThat(Solution().decodeString("abc3[cd]xyz"), equalTo("abccdcdcdxyz"))
    }
}
