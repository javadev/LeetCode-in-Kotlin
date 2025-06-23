package g3501_3600.s3588_find_maximum_area_of_a_triangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxArea() {
        assertThat<Long>(
            Solution().maxArea(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 2),
                    intArrayOf(3, 2),
                    intArrayOf(3, 3),
                ),
            ),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun maxArea2() {
        assertThat<Long>(
            Solution().maxArea(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(3, 3),
                ),
            ),
            equalTo<Long>(-1L),
        )
    }
}
