package g0901_1000.s0940_distinct_subsequences_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctSubseqII() {
        assertThat(Solution().distinctSubseqII("abc"), equalTo(7))
    }

    @Test
    fun distinctSubseqII2() {
        assertThat(Solution().distinctSubseqII("aba"), equalTo(6))
    }

    @Test
    fun distinctSubseqII3() {
        assertThat(Solution().distinctSubseqII("aaa"), equalTo(3))
    }
}
