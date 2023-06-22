package g1801_1900.s1845_seat_reservation_manager

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SeatManagerTest {
    @Test
    fun seatManagerTest() {
        val seatManager = SeatManager(5)
        assertThat(seatManager.reserve(), equalTo(1))
        assertThat(seatManager.reserve(), equalTo(2))
        seatManager.unreserve(2)
        assertThat(seatManager.reserve(), equalTo(2))
        assertThat(seatManager.reserve(), equalTo(3))
        assertThat(seatManager.reserve(), equalTo(4))
        assertThat(seatManager.reserve(), equalTo(5))
        seatManager.unreserve(5)
    }
}
