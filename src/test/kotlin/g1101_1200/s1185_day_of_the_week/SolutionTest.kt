package g1101_1200.s1185_day_of_the_week

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dayOfTheWeek() {
        MatcherAssert.assertThat(Solution().dayOfTheWeek(31, 8, 2019), CoreMatchers.equalTo("Saturday"))
    }

    @Test
    fun dayOfTheWeek2() {
        MatcherAssert.assertThat(Solution().dayOfTheWeek(18, 7, 1999), CoreMatchers.equalTo("Sunday"))
    }

    @Test
    fun dayOfTheWeek3() {
        MatcherAssert.assertThat(Solution().dayOfTheWeek(15, 8, 1993), CoreMatchers.equalTo("Sunday"))
    }
}
