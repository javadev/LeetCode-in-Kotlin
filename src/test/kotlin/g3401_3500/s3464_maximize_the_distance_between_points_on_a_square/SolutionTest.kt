package g3401_3500.s3464_maximize_the_distance_between_points_on_a_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistance() {
        assertThat<Int>(
            Solution().maxDistance(
                2,
                arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(2, 0), intArrayOf(2, 2), intArrayOf(0, 0)),
                4,
            ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxDistance2() {
        assertThat<Int>(
            Solution()
                .maxDistance(
                    2,
                    arrayOf<IntArray>(
                        intArrayOf(0, 0),
                        intArrayOf(1, 2),
                        intArrayOf(2, 0),
                        intArrayOf(2, 2),
                        intArrayOf(2, 1),
                    ),
                    4,
                ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun maxDistance3() {
        assertThat<Int>(
            Solution()
                .maxDistance(
                    2,
                    arrayOf<IntArray>(
                        intArrayOf(0, 0),
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(1, 2),
                        intArrayOf(2, 0),
                        intArrayOf(2, 2),
                        intArrayOf(2, 1),
                    ),
                    5,
                ),
            equalTo<Int>(1),
        )
    }
}
