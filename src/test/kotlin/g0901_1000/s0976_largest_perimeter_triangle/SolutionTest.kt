package g0901_1000.s0976_largest_perimeter_triangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestPerimeter() {
        assertThat(Solution().largestPerimeter(intArrayOf(2, 1, 2)), equalTo(5))
    }

    @Test
    fun largestPerimeter2() {
        assertThat(Solution().largestPerimeter(intArrayOf(1, 2, 1)), equalTo(0))
    }
}
