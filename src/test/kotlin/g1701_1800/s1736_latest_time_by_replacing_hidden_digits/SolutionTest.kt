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

    @Test
    fun maximumTime4() {
        assertThat(Solution().maximumTime("?4:00"), equalTo("14:00"))
    }

    @Test
    fun maximumTime5() {
        assertThat(Solution().maximumTime("??:??"), equalTo("23:59"))
    }

    @Test
    fun maximumTime6() {
        assertThat(Solution().maximumTime("?3:15"), equalTo("23:15"))
    }

    @Test
    fun maximumTime7() {
        assertThat(Solution().maximumTime("2?:45"), equalTo("23:45"))
    }

    @Test
    fun maximumTime8() {
        assertThat(Solution().maximumTime("1?:??"), equalTo("19:59"))
    }

    @Test
    fun maximumTime9() {
        assertThat(Solution().maximumTime("10:?7"), equalTo("10:57"))
    }

    @Test
    fun maximumTime10() {
        assertThat(Solution().maximumTime("22:4?"), equalTo("22:49"))
    }
}
