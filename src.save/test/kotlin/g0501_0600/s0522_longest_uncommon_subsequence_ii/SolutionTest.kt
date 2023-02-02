package g0501_0600.s0522_longest_uncommon_subsequence_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLUSlength() {
        assertThat(Solution().findLUSlength(arrayOf("aba", "cdc", "eae")), equalTo(3))
    }

    @Test
    fun findLUSlength2() {
        assertThat(Solution().findLUSlength(arrayOf("aaa", "aaa", "aa")), equalTo(-1))
    }
}
