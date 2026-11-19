package g4001_4100.s4016_maximum_area_of_two_non_overlapping_square_submatrices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxArea() {
        assertThat<Int>(
            Solution().maxArea(
                arrayOf<IntArray>(
                    intArrayOf(1, 1, 1, 0),
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(0, 0, 1, 1),
                ),
            ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxArea2() {
        assertThat<Int>(
            Solution().maxArea(arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 0))),
            equalTo<Int>(1),
        )
    }

    @Test
    fun maxArea3() {
        assertThat<Int>(
            Solution().maxArea(arrayOf<IntArray>(intArrayOf(0, 0), intArrayOf(0, 1))),
            equalTo<Int>(0),
        )
    }
}
