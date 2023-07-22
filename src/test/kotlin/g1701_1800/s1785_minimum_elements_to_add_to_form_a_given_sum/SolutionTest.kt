package g1701_1800.s1785_minimum_elements_to_add_to_form_a_given_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minElements() {
        assertThat(Solution().minElements(intArrayOf(1, -1, 1), 3, -4), equalTo(2))
    }

    @Test
    fun minElements2() {
        assertThat(Solution().minElements(intArrayOf(1, -10, 9, 1), 100, 0), equalTo(1))
    }
}
