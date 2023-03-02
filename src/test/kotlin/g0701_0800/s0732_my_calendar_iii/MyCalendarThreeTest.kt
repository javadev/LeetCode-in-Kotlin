package g0701_0800.s0732_my_calendar_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyCalendarThreeTest {
    @Test
    fun myCalendarThreeTest() {
        val myCalendarThree = MyCalendarThree()
        assertThat(myCalendarThree.book(10, 20), equalTo(1))
        assertThat(myCalendarThree.book(50, 60), equalTo(1))
        assertThat(myCalendarThree.book(10, 40), equalTo(2))
        assertThat(myCalendarThree.book(5, 15), equalTo(3))
        assertThat(myCalendarThree.book(5, 10), equalTo(3))
        assertThat(myCalendarThree.book(25, 55), equalTo(3))
    }
}
