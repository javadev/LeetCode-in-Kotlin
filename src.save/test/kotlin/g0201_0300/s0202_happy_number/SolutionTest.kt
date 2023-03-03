package g0201_0300.s0202_happy_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isHappy() {
        assertThat(Solution().isHappy(19), equalTo(true))
    }

    @Test
    fun isHappy2() {
        assertThat(Solution().isHappy(2), equalTo(false))
    }
}
