package g2401_2500.s2409_count_days_spent_together

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDaysTogether() {
        assertThat(
            Solution().countDaysTogether("08-15", "08-18", "08-16", "08-19"), equalTo(3)
        )
    }

    @Test
    fun countDaysTogether2() {
        assertThat(
            Solution().countDaysTogether("10-01", "10-31", "11-01", "12-31"), equalTo(0)
        )
    }

    @Test
    fun countDaysTogether3() {
        assertThat(
            Solution().countDaysTogether("09-01", "10-19", "06-19", "10-20"), equalTo(49)
        )
    }

    @Test
    fun countDaysTogether4() {
        assertThat(
            Solution().countDaysTogether("08-06", "12-08", "02-04", "09-01"), equalTo(27)
        )
    }

    @Test
    fun countDaysTogether5() {
        assertThat(
            Solution().countDaysTogether("03-05", "07-14", "04-14", "09-21"), equalTo(92)
        )
    }
}
