package g0201_0300.s0263_ugly_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isUgly: Unit
        get() {
            assertThat(Solution().isUgly(6), equalTo(true))
        }

    @get:Test
    val isUgly2: Unit
        get() {
            assertThat(Solution().isUgly(8), equalTo(true))
        }

    @get:Test
    val isUgly3: Unit
        get() {
            assertThat(Solution().isUgly(14), equalTo(false))
        }

    @get:Test
    val isUgly4: Unit
        get() {
            assertThat(Solution().isUgly(1), equalTo(true))
        }
}
