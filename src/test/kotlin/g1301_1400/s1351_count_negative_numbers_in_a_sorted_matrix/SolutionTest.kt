package g1301_1400.s1351_count_negative_numbers_in_a_sorted_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countNegatives() {
        assertThat(
            Solution()
                .countNegatives(
                    arrayOf(
                        intArrayOf(4, 3, 2, -1),
                        intArrayOf(3, 2, 1, -1),
                        intArrayOf(1, 1, -1, -2),
                        intArrayOf(-1, -1, -2, -3),
                    ),
                ),
            equalTo(8),
        )
    }

    @Test
    fun countNegatives2() {
        assertThat(
            Solution().countNegatives(arrayOf(intArrayOf(3, 2), intArrayOf(1, 0))),
            equalTo(0),
        )
    }
}
