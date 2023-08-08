package g2701_2800.s2789_largest_element_in_an_array_after_merge_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxArrayValue() {
        assertThat(Solution().maxArrayValue(intArrayOf(2, 3, 7, 9, 3)), equalTo(21L))
    }

    @Test
    fun maxArrayValue2() {
        assertThat(Solution().maxArrayValue(intArrayOf(5, 3, 3)), equalTo(11L))
    }
}
