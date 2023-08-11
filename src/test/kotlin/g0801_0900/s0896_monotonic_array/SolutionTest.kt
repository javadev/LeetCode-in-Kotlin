package g0801_0900.s0896_monotonic_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isMonotonic() {
        assertThat(Solution().isMonotonic(intArrayOf(1, 2, 2, 3)), equalTo(true))
    }

    @Test
    fun isMonotonic2() {
        assertThat(Solution().isMonotonic(intArrayOf(6, 5, 4, 4)), equalTo(true))
    }

    @Test
    fun isMonotonic3() {
        assertThat(Solution().isMonotonic(intArrayOf(1, 3, 2)), equalTo(false))
    }
}
