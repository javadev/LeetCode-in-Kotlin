package g1101_1200.s1109_corporate_flight_bookings

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun corpFlightBookings() {
        MatcherAssert.assertThat(
            Solution()
                .corpFlightBookings(arrayOf(intArrayOf(1, 2, 10), intArrayOf(2, 3, 20), intArrayOf(2, 5, 25)), 5),
            CoreMatchers.equalTo(intArrayOf(10, 55, 45, 25, 25))
        )
    }

    @Test
    fun corpFlightBookings2() {
        MatcherAssert.assertThat(
            Solution().corpFlightBookings(arrayOf(intArrayOf(1, 2, 10), intArrayOf(2, 2, 15)), 2),
            CoreMatchers.equalTo(intArrayOf(10, 25))
        )
    }
}
