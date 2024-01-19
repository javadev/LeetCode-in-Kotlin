package g2901_3000.s2965_find_missing_and_repeated_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMissingAndRepeatedValues() {
        assertThat(
            Solution().findMissingAndRepeatedValues(arrayOf(intArrayOf(1, 3), intArrayOf(2, 2))),
            equalTo(intArrayOf(2, 4))
        )
    }

    @Test
    fun findMissingAndRepeatedValues2() {
        assertThat(
            Solution()
                .findMissingAndRepeatedValues(
                    arrayOf(intArrayOf(9, 1, 7), intArrayOf(8, 9, 2), intArrayOf(3, 4, 6))
                ),
            equalTo(intArrayOf(9, 5))
        )
    }
}
