package g2401_2500.s2437_number_of_valid_clock_times

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTime() {
        assertThat(Solution().countTime("?5:00"), equalTo(2))
    }

    @Test
    fun countTime2() {
        assertThat(Solution().countTime("0?:0?"), equalTo(100))
    }

    @Test
    fun countTime3() {
        assertThat(Solution().countTime("??:??"), equalTo(1440))
    }
}
