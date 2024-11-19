package g2901_3000.s2975_maximum_square_area_by_removing_fences_from_a_field

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeSquareArea() {
        assertThat(
            Solution().maximizeSquareArea(4, 3, intArrayOf(2, 3), intArrayOf(2)),
            equalTo(4),
        )
    }

    @Test
    fun maximizeSquareArea2() {
        assertThat(
            Solution().maximizeSquareArea(6, 7, intArrayOf(2), intArrayOf(4)),
            equalTo(-1),
        )
    }
}
