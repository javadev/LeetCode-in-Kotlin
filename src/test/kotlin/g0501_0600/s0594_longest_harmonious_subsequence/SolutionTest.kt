package g0501_0600.s0594_longest_harmonious_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLHS() {
        assertThat(Solution().findLHS(intArrayOf(1, 3, 2, 2, 5, 2, 3, 7)), equalTo(5))
    }

    @Test
    fun findLHS2() {
        assertThat(Solution().findLHS(intArrayOf(1, 2, 3, 4)), equalTo(2))
    }

    @Test
    fun findLHS3() {
        assertThat(Solution().findLHS(intArrayOf(1, 1, 1, 1)), equalTo(0))
    }
}
