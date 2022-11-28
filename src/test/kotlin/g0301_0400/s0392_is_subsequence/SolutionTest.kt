package g0301_0400.s0392_is_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSubsequence() {
        assertThat(Solution().isSubsequence("abc", "ahbgdc"), equalTo(true))
    }

    @Test
    fun isSubsequence2() {
        assertThat(Solution().isSubsequence("axc", "ahbgdc"), equalTo(false))
    }
}
