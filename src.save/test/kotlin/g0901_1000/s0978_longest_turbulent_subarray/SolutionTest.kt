package g0901_1000.s0978_longest_turbulent_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTurbulenceSize() {
        assertThat(
            Solution().maxTurbulenceSize(intArrayOf(9, 4, 2, 10, 7, 8, 8, 1, 9)),
            equalTo(5)
        )
    }

    @Test
    fun maxTurbulenceSize2() {
        assertThat(Solution().maxTurbulenceSize(intArrayOf(4, 8, 12, 16)), equalTo(2))
    }

    @Test
    fun maxTurbulenceSize3() {
        assertThat(Solution().maxTurbulenceSize(intArrayOf(100)), equalTo(1))
    }
}
