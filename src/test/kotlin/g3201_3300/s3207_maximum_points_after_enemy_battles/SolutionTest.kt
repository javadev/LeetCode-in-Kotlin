package g3201_3300.s3207_maximum_points_after_enemy_battles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumPoints() {
        assertThat(Solution().maximumPoints(intArrayOf(3, 2, 2), 2), equalTo(3L))
    }

    @Test
    fun maximumPoints2() {
        assertThat(Solution().maximumPoints(intArrayOf(2), 10), equalTo(5L))
    }
}
