package g3101_3200.s3111_minimum_rectangles_to_cover_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minRectanglesToCoverPoints() {
        assertThat(
            Solution()
                .minRectanglesToCoverPoints(
                    arrayOf(
                        intArrayOf(2, 1),
                        intArrayOf(1, 0),
                        intArrayOf(1, 4),
                        intArrayOf(1, 8),
                        intArrayOf(3, 5),
                        intArrayOf(4, 6)
                    ),
                    1
                ),
            equalTo(2)
        )
    }

    @Test
    fun minRectanglesToCoverPoints2() {
        assertThat(
            Solution()
                .minRectanglesToCoverPoints(
                    arrayOf(
                        intArrayOf(0, 0),
                        intArrayOf(1, 1),
                        intArrayOf(2, 2),
                        intArrayOf(3, 3),
                        intArrayOf(4, 4),
                        intArrayOf(5, 5),
                        intArrayOf(6, 6)
                    ),
                    2
                ),
            equalTo(3)
        )
    }

    @Test
    fun minRectanglesToCoverPoints3() {
        assertThat(
            Solution().minRectanglesToCoverPoints(arrayOf(intArrayOf(2, 3), intArrayOf(1, 2)), 0),
            equalTo(2)
        )
    }
}
