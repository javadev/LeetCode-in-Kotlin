package g0701_0800.s0729_my_calendar_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun myCalendarTest() {
        val myCalendar = MyCalendar()
        assertThat(myCalendar.book(10, 20), equalTo(true))
        assertThat(myCalendar.book(15, 25), equalTo(false))
        assertThat(myCalendar.book(20, 30), equalTo(true))
    }
}
