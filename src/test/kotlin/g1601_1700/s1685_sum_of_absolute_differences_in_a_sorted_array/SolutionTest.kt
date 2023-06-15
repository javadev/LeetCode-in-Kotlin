package g1601_1700.s1685_sum_of_absolute_differences_in_a_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumAbsoluteDifferences() {
        assertThat(
            Solution().getSumAbsoluteDifferences(intArrayOf(2, 3, 5)),
            equalTo(intArrayOf(4, 3, 5))
        )
    }

    @Test
    fun sumAbsoluteDifferences2() {
        assertThat(
            Solution().getSumAbsoluteDifferences(intArrayOf(1, 4, 6, 8, 10)),
            equalTo(intArrayOf(24, 15, 13, 15, 21))
        )
    }
}
