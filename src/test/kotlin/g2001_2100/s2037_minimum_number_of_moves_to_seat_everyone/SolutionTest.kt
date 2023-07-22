package g2001_2100.s2037_minimum_number_of_moves_to_seat_everyone

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMovesToSeat() {
        assertThat(
            Solution().minMovesToSeat(intArrayOf(3, 1, 5), intArrayOf(2, 7, 4)),
            equalTo(4)
        )
    }

    @Test
    fun minMovesToSeat2() {
        assertThat(
            Solution().minMovesToSeat(intArrayOf(4, 1, 5, 9), intArrayOf(1, 3, 2, 6)),
            equalTo(7)
        )
    }

    @Test
    fun minMovesToSeat3() {
        assertThat(
            Solution().minMovesToSeat(intArrayOf(2, 2, 6, 6), intArrayOf(1, 3, 2, 6)),
            equalTo(4)
        )
    }
}
