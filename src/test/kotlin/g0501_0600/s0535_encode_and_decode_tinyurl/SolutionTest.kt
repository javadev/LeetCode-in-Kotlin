package g0501_0600.s0535_encode_and_decode_tinyurl

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun codec() {
        val url = "https://leetcode.com/problems/design-tinyurl"
        val obj = Codec()
        val tiny = obj.encode(url)
        val ans = obj.decode(tiny)
        assertThat(ans, equalTo(url))
    }
}
