package g1701_1800.s1745_palindrome_partitioning_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkPartitioning() {
        assertThat(Solution().checkPartitioning("abcbdd"), equalTo(true))
    }

    @Test
    fun checkPartitioning2() {
        assertThat(Solution().checkPartitioning("bcbddxy"), equalTo(false))
    }
}
