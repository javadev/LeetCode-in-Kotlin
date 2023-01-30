package g0501_0600.s0583_delete_operation_for_two_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDistance() {
        assertThat(Solution().minDistance("sea", "eat"), equalTo(2))
    }

    @Test
    fun minDistance2() {
        assertThat(Solution().minDistance("leetcode", "etco"), equalTo(4))
    }
}
