package g3601_3700.s3623_count_number_of_trapezoids_i

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
                        intArrayOf(1, 0),
                        intArrayOf(2, 0),
                        intArrayOf(3, 0),
                        intArrayOf(2, 2),
                        intArrayOf(3, 2),
                    ),
                ),
            equalTo<Int>(3),
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
}
