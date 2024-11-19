package g0501_0600.s0506_relative_ranks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRelativeRanks() {
        assertThat(
            Solution().findRelativeRanks(intArrayOf(5, 4, 3, 2, 1)),
            equalTo(arrayOf("Gold Medal", "Silver Medal", "Bronze Medal", "4", "5")),
        )
    }

    @Test
    fun findRelativeRanks2() {
        assertThat(
            Solution().findRelativeRanks(intArrayOf(10, 3, 8, 9, 4)),
            equalTo(arrayOf("Gold Medal", "5", "Bronze Medal", "Silver Medal", "4")),
        )
    }
}
