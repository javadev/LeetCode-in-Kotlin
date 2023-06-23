package g2101_2200.s2119_a_number_after_a_double_reversal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isSameAfterReversals: Unit
        get() {
            assertThat(Solution().isSameAfterReversals(526), equalTo(true))
        }

    @get:Test
    val isSameAfterReversals2: Unit
        get() {
            assertThat(Solution().isSameAfterReversals(1800), equalTo(false))
        }

    @get:Test
    val isSameAfterReversals3: Unit
        get() {
            assertThat(Solution().isSameAfterReversals(0), equalTo(true))
        }
}
