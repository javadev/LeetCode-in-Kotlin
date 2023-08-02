package g2201_2300.s2275_largest_combination_with_bitwise_and_greater_than_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestCombination() {
        assertThat(
            Solution().largestCombination(intArrayOf(16, 17, 71, 62, 12, 24, 14)),
            equalTo(4)
        )
    }

    @Test
    fun largestCombination2() {
        assertThat(Solution().largestCombination(intArrayOf(8, 8)), equalTo(2))
    }
}
