package g0401_0500.s0414_third_maximum_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun thirdMax() {
        assertThat(Solution().thirdMax(intArrayOf(3, 2, 1)), equalTo(1))
    }

    @Test
    fun thirdMax2() {
        assertThat(Solution().thirdMax(intArrayOf(1, 2)), equalTo(2))
    }
}
