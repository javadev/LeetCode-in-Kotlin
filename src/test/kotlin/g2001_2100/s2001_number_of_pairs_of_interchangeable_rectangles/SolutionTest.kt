package g2001_2100.s2001_number_of_pairs_of_interchangeable_rectangles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun interchangeableRectangles() {
        assertThat(
            Solution()
                .interchangeableRectangles(
                    arrayOf(
                        intArrayOf(4, 8),
                        intArrayOf(3, 6),
                        intArrayOf(10, 20),
                        intArrayOf(15, 30)
                    )
                ),
            equalTo(6L)
        )
    }

    @Test
    fun interchangeableRectangles2() {
        assertThat(
            Solution().interchangeableRectangles(arrayOf(intArrayOf(4, 5), intArrayOf(7, 8))),
            equalTo(0L)
        )
    }
}
