package g2901_3000.s2996_smallest_missing_integer_greater_than_sequential_prefix_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun missingInteger() {
        assertThat(Solution().missingInteger(intArrayOf(1, 2, 3, 2, 5)), equalTo(6))
    }

    @Test
    fun missingInteger2() {
        assertThat(
            Solution().missingInteger(intArrayOf(3, 4, 5, 1, 12, 14, 13)),
            equalTo(15),
        )
    }
}
