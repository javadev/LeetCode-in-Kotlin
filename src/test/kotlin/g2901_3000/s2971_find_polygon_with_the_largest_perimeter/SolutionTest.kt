package g2901_3000.s2971_find_polygon_with_the_largest_perimeter

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestPerimeter() {
        assertThat(Solution().largestPerimeter(intArrayOf(5, 5, 5)), equalTo(15L))
    }

    @Test
    fun largestPerimeter2() {
        assertThat(
            Solution().largestPerimeter(intArrayOf(1, 12, 1, 2, 5, 50, 3)),
            equalTo(12L),
        )
    }

    @Test
    fun largestPerimeter3() {
        assertThat(Solution().largestPerimeter(intArrayOf(5, 5, 50)), equalTo(-1L))
    }
}
