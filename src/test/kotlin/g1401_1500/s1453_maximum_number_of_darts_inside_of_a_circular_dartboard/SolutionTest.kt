package g1401_1500.s1453_maximum_number_of_darts_inside_of_a_circular_dartboard

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numPoints() {
        assertThat(
            Solution().numPoints(arrayOf(intArrayOf(-2, 0), intArrayOf(2, 0), intArrayOf(0, 2), intArrayOf(0, -2)), 2),
            equalTo(4),
        )
    }

    @Test
    fun numPoints2() {
        assertThat(
            Solution()
                .numPoints(
                    arrayOf(
                        intArrayOf(-3, 0),
                        intArrayOf(3, 0),
                        intArrayOf(2, 6),
                        intArrayOf(5, 4),
                        intArrayOf(0, 9),
                        intArrayOf(7, 8),
                    ),
                    5,
                ),
            equalTo(5),
        )
    }
}
