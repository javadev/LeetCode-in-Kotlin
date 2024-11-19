package g3101_3200.s3143_maximum_points_inside_the_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPointsInsideSquare() {
        assertThat(
            Solution()
                .maxPointsInsideSquare(
                    arrayOf(
                        intArrayOf(2, 2),
                        intArrayOf(-1, -2),
                        intArrayOf(-4, 4),
                        intArrayOf(-3, 1),
                        intArrayOf(3, -3),
                    ),
                    "abdca",
                ),
            equalTo(2),
        )
    }

    @Test
    fun maxPointsInsideSquare2() {
        assertThat(
            Solution()
                .maxPointsInsideSquare(arrayOf(intArrayOf(1, 1), intArrayOf(-2, -2), intArrayOf(-2, 2)), "abb"),
            equalTo(1),
        )
    }
}
