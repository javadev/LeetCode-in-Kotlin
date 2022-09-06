package g0201_0300.s0202_happy_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isHappy: Unit
        get() {
            assertThat(Solution().isHappy(19), equalTo(true))
        }

    @get:Test
    val isHappy2: Unit
        get() {
            assertThat(Solution().isHappy(2), equalTo(false))
        }
}
