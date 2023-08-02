package g2501_2600.s2598_smallest_missing_non_negative_integer_after_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSmallestInteger() {
        assertThat(Solution().findSmallestInteger(intArrayOf(1, -10, 7, 13, 6, 8), 5), equalTo(4))
    }

    @Test
    fun findSmallestInteger2() {
        assertThat(Solution().findSmallestInteger(intArrayOf(1, -10, 7, 13, 6, 8), 7), equalTo(2))
    }
}
