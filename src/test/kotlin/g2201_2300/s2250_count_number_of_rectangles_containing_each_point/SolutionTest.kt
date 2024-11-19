package g2201_2300.s2250_count_number_of_rectangles_containing_each_point

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRectangles() {
        assertThat(
            Solution()
                .countRectangles(
                    arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 5)),
                    arrayOf(intArrayOf(2, 1), intArrayOf(1, 4)),
                ),
            equalTo(intArrayOf(2, 1)),
        )
    }

    @Test
    fun countRectangles2() {
        assertThat(
            Solution()
                .countRectangles(
                    arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3)),
                    arrayOf(intArrayOf(1, 3), intArrayOf(1, 1)),
                ),
            equalTo(intArrayOf(1, 3)),
        )
    }
}
