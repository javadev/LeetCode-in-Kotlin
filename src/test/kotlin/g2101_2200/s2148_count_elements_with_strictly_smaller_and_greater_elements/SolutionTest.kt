package g2101_2200.s2148_count_elements_with_strictly_smaller_and_greater_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countElements() {
        assertThat(Solution().countElements(intArrayOf(11, 7, 2, 15)), equalTo(2))
    }

    @Test
    fun countElements2() {
        assertThat(Solution().countElements(intArrayOf(-3, 3, 3, 90)), equalTo(2))
    }

    @Test
    fun countElements3() {
        assertThat(Solution().countElements(intArrayOf(-71, -71, 93, -71, 40)), equalTo(1))
    }
}
