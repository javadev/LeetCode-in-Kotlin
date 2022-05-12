package g0001_0100.s0011_container_with_most_water

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxArea() {
        assertThat(Solution().maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)), equalTo(49))
    }

    @Test
    fun maxArea2() {
        assertThat(Solution().maxArea(intArrayOf(1, 1)), equalTo(1))
    }
}
