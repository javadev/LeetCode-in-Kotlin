package g2401_2500.s2483_minimum_penalty_for_a_shop

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bestClosingTime() {
        assertThat(Solution().bestClosingTime("NNNNN"), equalTo(0))
    }

    @Test
    fun bestClosingTime2() {
        assertThat(Solution().bestClosingTime("YYYY"), equalTo(4))
    }
}
