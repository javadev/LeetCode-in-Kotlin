package g0101_0200.s0132_palindrome_partitioning_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCut() {
        assertThat(Solution().minCut("aab"), equalTo(1))
    }

    @Test
    fun minCut2() {
        assertThat(Solution().minCut("a"), equalTo(0))
    }

    @Test
    fun minCut3() {
        assertThat(Solution().minCut("ab"), equalTo(1))
    }
}
