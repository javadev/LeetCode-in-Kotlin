package g1901_2000.s1954_minimum_garden_perimeter_to_collect_enough_apples

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumPerimeter() {
        assertThat(Solution().minimumPerimeter(1), equalTo(8L))
    }

    @Test
    fun minimumPerimeter2() {
        assertThat(Solution().minimumPerimeter(13), equalTo(16L))
    }

    @Test
    fun minimumPerimeter3() {
        assertThat(Solution().minimumPerimeter(1000000000), equalTo(5040L))
    }
}
