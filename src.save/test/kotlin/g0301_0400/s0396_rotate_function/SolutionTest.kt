package g0301_0400.s0396_rotate_function

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRotateFunction() {
        assertThat(Solution().maxRotateFunction(intArrayOf(4, 3, 2, 6)), equalTo(26))
    }

    @Test
    fun maxRotateFunction2() {
        assertThat(Solution().maxRotateFunction(intArrayOf(100)), equalTo(0))
    }
}
