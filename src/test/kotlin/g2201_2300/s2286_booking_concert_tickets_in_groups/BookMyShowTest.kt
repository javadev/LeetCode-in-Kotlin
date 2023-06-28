package g2201_2300.s2286_booking_concert_tickets_in_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class BookMyShowTest {
    @Test
    fun bookMyShow() {
        // There are 2 rows with 5 seats each
        val bms = BookMyShow(2, 5)
        // return [0, 0]
        assertThat(bms.gather(4, 0), equalTo(intArrayOf(0, 0)))
        // The group books seats [0, 3] of row 0.
        // return []
        assertThat(bms.gather(2, 0), equalTo(intArrayOf()))
        // There is only 1 seat left in row 0,
        // so it is not possible to book 2 consecutive seats.
        // return True
        assertThat(bms.scatter(5, 1), equalTo(true))
        // The group books seat 4 of row 0 and seats [0, 3] of row 1.
        // return False
        assertThat(bms.scatter(5, 1), equalTo(false))
        // There is only one seat left in the hall.
    }

    @Test
    fun bookMyShow2() {
        // There are 2 rows with 6 seats each
        val bms = BookMyShow(2, 6)
        assertThat(bms.scatter(2, 1), equalTo(true))
        assertThat(bms.scatter(8, 0), equalTo(false))
    }
}
