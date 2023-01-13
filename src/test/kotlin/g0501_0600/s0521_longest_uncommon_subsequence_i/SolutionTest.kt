package g0501_0600.s0521_longest_uncommon_subsequence_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLUSlength() {
        assertThat(Solution().findLUSlength("aba", "cdc"), equalTo(3))
    }

    @Test
    fun findLUSlength2() {
        assertThat(Solution().findLUSlength("aaa", "bbb"), equalTo(3))
    }

    @Test
    fun findLUSlength3() {
        assertThat(Solution().findLUSlength("aaa", "aaa"), equalTo(-1))
    }
}
