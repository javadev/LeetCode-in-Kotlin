package g0501_0600.s0553_optimal_division

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun optimalDivision() {
        assertThat(
            Solution().optimalDivision(intArrayOf(1000, 100, 10, 2)),
            equalTo("1000/(100/10/2)")
        )
    }

    @Test
    fun optimalDivision2() {
        assertThat(Solution().optimalDivision(intArrayOf(2, 3, 4)), equalTo("2/(3/4)"))
    }

    @Test
    fun optimalDivision3() {
        assertThat(Solution().optimalDivision(intArrayOf(2)), equalTo("2"))
    }
}
