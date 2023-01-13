package g0501_0600.s0520_detect_capital

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun detectCapitalUse() {
        assertThat(Solution().detectCapitalUse("USA"), equalTo(true))
    }

    @Test
    fun detectCapitalUse2() {
        assertThat(Solution().detectCapitalUse("FlaG"), equalTo(false))
    }
}
