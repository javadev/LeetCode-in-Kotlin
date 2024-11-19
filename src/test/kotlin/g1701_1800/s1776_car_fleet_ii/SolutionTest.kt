package g1701_1800.s1776_car_fleet_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun collisionTimes() {
        assertThat(
            Solution().getCollisionTimes(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 1),
                    intArrayOf(4, 3),
                    intArrayOf(7, 2),
                ),
            ),
            equalTo(doubleArrayOf(1.00000, -1.00000, 3.00000, -1.00000)),
        )
    }

    @Test
    fun collisionTimes2() {
        assertThat(
            Solution().getCollisionTimes(
                arrayOf(
                    intArrayOf(3, 4),
                    intArrayOf(5, 4),
                    intArrayOf(6, 3),
                    intArrayOf(9, 1),
                ),
            ),
            equalTo(doubleArrayOf(2.00000, 1.00000, 1.50000, -1.00000)),
        )
    }
}
