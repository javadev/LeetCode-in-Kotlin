package g1801_1900.s1828_queries_on_number_of_points_inside_a_circle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPoints() {
        assertThat(
            Solution()
                .countPoints(
                    arrayOf(intArrayOf(1, 3), intArrayOf(3, 3), intArrayOf(5, 3), intArrayOf(2, 2)),
                    arrayOf(intArrayOf(2, 3, 1), intArrayOf(4, 3, 1), intArrayOf(1, 1, 2)),
                ),
            equalTo(intArrayOf(3, 2, 2)),
        )
    }

    @Test
    fun countPoints2() {
        assertThat(
            Solution()
                .countPoints(
                    arrayOf(
                        intArrayOf(1, 1),
                        intArrayOf(2, 2),
                        intArrayOf(3, 3),
                        intArrayOf(4, 4),
                        intArrayOf(5, 5),
                    ),
                    arrayOf(intArrayOf(1, 2, 2), intArrayOf(2, 2, 2), intArrayOf(4, 3, 2), intArrayOf(4, 3, 3)),
                ),
            equalTo(intArrayOf(2, 3, 2, 4)),
        )
    }
}
