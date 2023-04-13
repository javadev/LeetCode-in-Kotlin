package g0801_0900.s0870_advantage_shuffle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun advantageCount() {
        assertThat(
            Solution().advantageCount(intArrayOf(2, 7, 11, 15), intArrayOf(1, 10, 4, 11)),
            equalTo(intArrayOf(2, 11, 7, 15))
        )
    }

    @Test
    fun advantageCount2() {
        assertThat(
            Solution()
                .advantageCount(intArrayOf(12, 24, 8, 32), intArrayOf(13, 25, 32, 11)),
            equalTo(intArrayOf(24, 32, 8, 12))
        )
    }
}
