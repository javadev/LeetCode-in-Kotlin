package g1601_1700.s1637_widest_vertical_area_between_two_points_containing_no_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWidthOfVerticalArea() {
        assertThat(
            Solution().maxWidthOfVerticalArea(
                arrayOf(
                    intArrayOf(8, 7),
                    intArrayOf(9, 9),
                    intArrayOf(7, 4),
                    intArrayOf(9, 7)
                )
            ),
            equalTo(1)
        )
    }

    @Test
    fun maxWidthOfVerticalArea2() {
        assertThat(
            Solution()
                .maxWidthOfVerticalArea(
                    arrayOf(
                        intArrayOf(3, 1),
                        intArrayOf(9, 0),
                        intArrayOf(1, 0),
                        intArrayOf(1, 4),
                        intArrayOf(5, 3),
                        intArrayOf(8, 8)
                    )
                ),
            equalTo(3)
        )
    }
}
