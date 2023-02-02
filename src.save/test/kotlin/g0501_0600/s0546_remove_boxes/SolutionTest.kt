package g0501_0600.s0546_remove_boxes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeBoxes() {
        assertThat(Solution().removeBoxes(intArrayOf(1, 3, 2, 2, 2, 3, 4, 3, 1)), equalTo(23))
    }

    @Test
    fun removeBoxes2() {
        assertThat(Solution().removeBoxes(intArrayOf(1, 1, 1)), equalTo(9))
    }

    @Test
    fun removeBoxes3() {
        assertThat(Solution().removeBoxes(intArrayOf(1)), equalTo(1))
    }
}
