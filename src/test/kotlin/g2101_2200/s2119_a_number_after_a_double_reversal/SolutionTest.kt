package g2101_2200.s2119_a_number_after_a_double_reversal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSameAfterReversals() {
        assertThat(Solution().isSameAfterReversals(526), equalTo(true))
    }

    @Test
    fun isSameAfterReversals2() {
        assertThat(Solution().isSameAfterReversals(1800), equalTo(false))
    }

    @Test
    fun isSameAfterReversals3() {
        assertThat(Solution().isSameAfterReversals(0), equalTo(true))
    }
}
