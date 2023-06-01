package g0801_0900.s0869_reordered_power_of_2

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reorderedPowerOf2() {
        assertThat(Solution().reorderedPowerOf2(1), equalTo(true))
    }

    @Test
    fun reorderedPowerOf22() {
        assertThat(Solution().reorderedPowerOf2(10), equalTo(false))
    }
}
