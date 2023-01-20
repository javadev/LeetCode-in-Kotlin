package g0501_0600.s0556_next_greater_element_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextGreaterElement() {
        assertThat(Solution().nextGreaterElement(12), equalTo(21))
    }

    @Test
    fun nextGreaterElement2() {
        assertThat(Solution().nextGreaterElement(21), equalTo(-1))
    }
}
