package g0301_0400.s0375_guess_number_higher_or_lower_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getMoneyAmount() {
        assertThat(Solution().getMoneyAmount(10), equalTo(16))
    }

    @Test
    fun getMoneyAmount2() {
        assertThat(Solution().getMoneyAmount(1), equalTo(0))
    }

    @Test
    fun getMoneyAmount3() {
        assertThat(Solution().getMoneyAmount(2), equalTo(1))
    }
}
