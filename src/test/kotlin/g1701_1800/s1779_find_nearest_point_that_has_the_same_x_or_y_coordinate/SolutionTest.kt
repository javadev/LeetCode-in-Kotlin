package g1701_1800.s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nearestValidPoint() {
        assertThat(
            Solution()
                .nearestValidPoint(
                    3, 4,
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(3, 1),
                        intArrayOf(2, 4), intArrayOf(2, 3), intArrayOf(4, 4)
                    )
                ),
            equalTo(2)
        )
    }

    @Test
    fun nearestValidPoint2() {
        assertThat(Solution().nearestValidPoint(3, 4, arrayOf(intArrayOf(3, 4))), equalTo(0))
    }

    @Test
    fun nearestValidPoint3() {
        assertThat(Solution().nearestValidPoint(3, 4, arrayOf(intArrayOf(2, 3))), equalTo(-1))
    }
}
