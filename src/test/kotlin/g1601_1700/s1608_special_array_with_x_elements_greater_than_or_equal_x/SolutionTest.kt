package g1601_1700.s1608_special_array_with_x_elements_greater_than_or_equal_x

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun specialArray() {
        assertThat(Solution().specialArray(intArrayOf(3, 5)), equalTo(2))
    }

    @Test
    fun specialArray2() {
        assertThat(Solution().specialArray(intArrayOf(0, 0)), equalTo(-1))
    }

    @Test
    fun specialArray3() {
        assertThat(Solution().specialArray(intArrayOf(0, 4, 3, 0, 4)), equalTo(3))
    }
}
