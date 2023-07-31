package g2701_2800.s2711_difference_of_number_of_distinct_values_on_diagonals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun differenceOfDistinctValues() {
        assertThat(
            Solution().differenceOfDistinctValues(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(3, 1, 5), intArrayOf(3, 2, 1)
                )
            ),
            equalTo(arrayOf(intArrayOf(1, 1, 0), intArrayOf(1, 0, 1), intArrayOf(0, 1, 1)))
        )
    }

    @Test
    fun differenceOfDistinctValues2() {
        assertThat(
            Solution().differenceOfDistinctValues(arrayOf(intArrayOf(1))),
            equalTo(arrayOf(intArrayOf(0)))
        )
    }
}
