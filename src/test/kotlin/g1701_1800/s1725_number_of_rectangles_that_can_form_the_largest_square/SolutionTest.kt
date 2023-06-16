package g1701_1800.s1725_number_of_rectangles_that_can_form_the_largest_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodRectangles() {
        assertThat(
            Solution().countGoodRectangles(
                arrayOf(
                    intArrayOf(5, 8),
                    intArrayOf(3, 9), intArrayOf(5, 12), intArrayOf(16, 5)
                )
            ),
            equalTo(3)
        )
    }

    @Test
    fun countGoodRectangles2() {
        assertThat(
            Solution().countGoodRectangles(
                arrayOf(
                    intArrayOf(2, 3),
                    intArrayOf(3, 7), intArrayOf(4, 3), intArrayOf(3, 7)
                )
            ),
            equalTo(3)
        )
    }
}
