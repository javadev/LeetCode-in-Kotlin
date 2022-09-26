package g0001_0100.s0097_interleaving_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isInterleave() {
        assertThat(Solution().isInterleave("aabcc", "dbbca", "aadbbcbcac"), equalTo(true))
    }

    @Test
    fun isInterleave2() {
        assertThat(Solution().isInterleave("aabcc", "dbbca", "aadbbbaccc"), equalTo(false))
    }

    @Test
    fun isInterleave3() {
        assertThat(Solution().isInterleave("", "", ""), equalTo(true))
    }
}
