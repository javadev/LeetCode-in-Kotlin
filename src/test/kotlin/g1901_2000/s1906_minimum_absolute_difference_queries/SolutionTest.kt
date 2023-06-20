package g1901_2000.s1906_minimum_absolute_difference_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDifference() {
        assertThat(
            Solution()
                .minDifference(
                    intArrayOf(1, 3, 4, 8),
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(0, 3)
                    )
                ),
            equalTo(intArrayOf(2, 1, 4, 1))
        )
    }

    @Test
    fun minDifference2() {
        assertThat(
            Solution()
                .minDifference(
                    intArrayOf(4, 5, 2, 2, 7, 10),
                    arrayOf(intArrayOf(2, 3), intArrayOf(0, 2), intArrayOf(0, 5), intArrayOf(3, 5))
                ),
            equalTo(intArrayOf(-1, 1, 1, 3))
        )
    }
}
