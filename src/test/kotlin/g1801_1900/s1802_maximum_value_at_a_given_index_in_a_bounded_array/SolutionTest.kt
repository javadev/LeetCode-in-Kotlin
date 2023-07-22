package g1801_1900.s1802_maximum_value_at_a_given_index_in_a_bounded_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValue() {
        assertThat(Solution().maxValue(4, 2, 6), equalTo(2))
    }

    @Test
    fun maxValue2() {
        assertThat(Solution().maxValue(6, 1, 10), equalTo(3))
    }
}
