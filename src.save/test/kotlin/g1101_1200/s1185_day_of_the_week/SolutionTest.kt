package g1101_1200.s1185_day_of_the_week

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dayOfTheWeek() {
        assertThat(Solution().dayOfTheWeek(31, 8, 2019), equalTo("Saturday"))
    }

    @Test
    fun dayOfTheWeek2() {
        assertThat(Solution().dayOfTheWeek(18, 7, 1999), equalTo("Sunday"))
    }

    @Test
    fun dayOfTheWeek3() {
        assertThat(Solution().dayOfTheWeek(15, 8, 1993), equalTo("Sunday"))
    }
}
