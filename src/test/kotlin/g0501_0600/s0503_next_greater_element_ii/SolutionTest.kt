package g0501_0600.s0503_next_greater_element_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextGreaterElements() {
        assertThat(
            Solution().nextGreaterElements(intArrayOf(1, 2, 1)),
            equalTo(intArrayOf(2, -1, 2))
        )
    }

    @Test
    fun nextGreaterElements2() {
        assertThat(
            Solution().nextGreaterElements(intArrayOf(1, 2, 3, 4, 3)),
            equalTo(intArrayOf(2, 3, 4, -1, 4))
        )
    }
}
