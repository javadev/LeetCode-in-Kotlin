package g2501_2600.s2503_maximum_number_of_points_from_grid_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPoints() {
        assertThat(
            Solution()
                .maxPoints(arrayOf(intArrayOf(1, 2, 3), intArrayOf(2, 5, 7), intArrayOf(3, 5, 1)), intArrayOf(5, 6, 2)),
            equalTo(intArrayOf(5, 8, 1))
        )
    }

    @Test
    fun maxPoints2() {
        assertThat(
            Solution().maxPoints(arrayOf(intArrayOf(5, 2, 1), intArrayOf(1, 1, 2)), intArrayOf(3)),
            equalTo(intArrayOf(0))
        )
    }
}
