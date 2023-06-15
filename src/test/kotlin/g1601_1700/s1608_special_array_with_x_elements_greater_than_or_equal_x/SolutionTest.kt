package g1601_1700.s1608_special_array_with_x_elements_greater_than_or_equal_x

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun specialArray() {
        MatcherAssert.assertThat(Solution().specialArray(intArrayOf(3, 5)), CoreMatchers.equalTo(2))
    }

    @Test
    fun specialArray2() {
        MatcherAssert.assertThat(Solution().specialArray(intArrayOf(0, 0)), CoreMatchers.equalTo(-1))
    }

    @Test
    fun specialArray3() {
        MatcherAssert.assertThat(Solution().specialArray(intArrayOf(0, 4, 3, 0, 4)), CoreMatchers.equalTo(3))
    }
}
