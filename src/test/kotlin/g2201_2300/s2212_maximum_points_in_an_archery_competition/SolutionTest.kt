package g2201_2300.s2212_maximum_points_in_an_archery_competition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumBobPoints() {
        assertThat(
            Solution().maximumBobPoints(9, intArrayOf(1, 1, 0, 1, 0, 0, 2, 1, 0, 1, 2, 0)),
            equalTo(intArrayOf(0, 0, 0, 0, 1, 1, 0, 0, 1, 2, 3, 1)),
        )
    }

    @Test
    fun maximumBobPoints2() {
        assertThat(
            Solution().maximumBobPoints(3, intArrayOf(0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2)),
            equalTo(intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0)),
        )
    }
}
