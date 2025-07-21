package g3601_3700.s3625_count_number_of_trapezoids_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTrapezoids() {
        assertThat<Int>(
            Solution()
                .countTrapezoids(
                    arrayOf<IntArray>(
                        intArrayOf(-3, 2),
                        intArrayOf(3, 0),
                        intArrayOf(2, 3),
                        intArrayOf(3, 2),
                        intArrayOf(2, -3),
                    ),
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countTrapezoids2() {
        assertThat<Int>(
            Solution().countTrapezoids(
                arrayOf<IntArray>(
                    intArrayOf(0, 0),
                    intArrayOf(1, 0),
                    intArrayOf(0, 1),
                    intArrayOf(2, 1),
                ),
            ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countTrapezoids3() {
        assertThat<Int>(
            Solution()
                .countTrapezoids(
                    arrayOf<IntArray>(
                        intArrayOf(71, -89),
                        intArrayOf(-75, -89),
                        intArrayOf(-9, 11),
                        intArrayOf(-24, -89),
                        intArrayOf(-51, -89),
                        intArrayOf(-77, -89),
                        intArrayOf(42, 11),
                    ),
                ),
            equalTo<Int>(10),
        )
    }
}
