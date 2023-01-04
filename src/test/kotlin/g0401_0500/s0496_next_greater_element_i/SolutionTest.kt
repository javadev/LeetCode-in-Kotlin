package g0401_0500.s0496_next_greater_element_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextGreaterElement() {
        assertThat(
            Solution().nextGreaterElement(intArrayOf(4, 1, 2), intArrayOf(1, 3, 4, 2)),
            equalTo(intArrayOf(-1, 3, -1))
        )
    }

    @Test
    fun nextGreaterElement2() {
        assertThat(
            Solution().nextGreaterElement(intArrayOf(2, 4), intArrayOf(1, 2, 3, 4)),
            equalTo(intArrayOf(3, -1))
        )
    }
}
