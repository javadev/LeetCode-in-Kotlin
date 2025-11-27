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

    @Test
    fun dayOfTheWeek4() {
        assertThat(Solution().dayOfTheWeek(1, 1, 1971), equalTo("Friday"))
    }

    @Test
    fun dayOfTheWeek5() {
        assertThat(Solution().dayOfTheWeek(29, 2, 2020), equalTo("Saturday"))
    }

    @Test
    fun dayOfTheWeek6() {
        assertThat(Solution().dayOfTheWeek(1, 3, 2020), equalTo("Sunday"))
    }

    @Test
    fun dayOfTheWeek7() {
        assertThat(Solution().dayOfTheWeek(28, 2, 2019), equalTo("Thursday"))
    }

    @Test
    fun dayOfTheWeek8() {
        assertThat(Solution().dayOfTheWeek(31, 12, 1999), equalTo("Friday"))
    }

    @Test
    fun dayOfTheWeek9() {
        assertThat(Solution().dayOfTheWeek(1, 1, 2001), equalTo("Monday"))
    }

    @Test
    fun dayOfTheWeek10() {
        assertThat(Solution().dayOfTheWeek(1, 1, 2000), equalTo("Saturday"))
    }

    @Test
    fun dayOfTheWeek11() {
        assertThat(Solution().dayOfTheWeek(1, 3, 1900), equalTo("Monday"))
    }

    @Test
    fun dayOfTheWeek12() {
        assertThat(Solution().dayOfTheWeek(15, 6, 2024), equalTo("Saturday"))
    }

    @Test
    fun dayOfTheWeek13() {
        assertThat(Solution().dayOfTheWeek(30, 11, 1985), equalTo("Saturday"))
    }

    @Test
    fun dayOfTheWeek14() {
        assertThat(Solution().dayOfTheWeek(20, 4, 1975), equalTo("Sunday"))
    }

    @Test
    fun dayOfTheWeek15() {
        assertThat(Solution().dayOfTheWeek(5, 1, 1971), equalTo("Tuesday"))
    }

    @Test
    fun dayOfTheWeek16() {
        assertThat(Solution().dayOfTheWeek(6, 1, 1971), equalTo("Wednesday"))
    }
}
