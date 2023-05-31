package g1101_1200.s1109_corporate_flight_bookings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun corpFlightBookings() {
        assertThat(
            Solution()
                .corpFlightBookings(arrayOf(intArrayOf(1, 2, 10), intArrayOf(2, 3, 20), intArrayOf(2, 5, 25)), 5),
            equalTo(intArrayOf(10, 55, 45, 25, 25))
        )
    }

    @Test
    fun corpFlightBookings2() {
        assertThat(
            Solution().corpFlightBookings(arrayOf(intArrayOf(1, 2, 10), intArrayOf(2, 2, 15)), 2),
            equalTo(intArrayOf(10, 25))
        )
    }
}
