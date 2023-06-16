package g1701_1800.s1736_latest_time_by_replacing_hidden_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTime() {
        assertThat(Solution().maximumTime("2?:?0"), equalTo("23:50"))
    }

    @Test
    fun maximumTime2() {
        assertThat(Solution().maximumTime("0?:3?"), equalTo("09:39"))
    }

    @Test
    fun maximumTime3() {
        assertThat(Solution().maximumTime("1?:22"), equalTo("19:22"))
    }
}
