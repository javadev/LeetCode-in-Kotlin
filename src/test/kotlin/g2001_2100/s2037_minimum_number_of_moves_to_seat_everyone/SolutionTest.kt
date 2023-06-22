package g2001_2100.s2037_minimum_number_of_moves_to_seat_everyone

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMovesToSeat() {
        MatcherAssert.assertThat(
            Solution().minMovesToSeat(intArrayOf(3, 1, 5), intArrayOf(2, 7, 4)),
            CoreMatchers.equalTo(4)
        )
    }

    @Test
    fun minMovesToSeat2() {
        MatcherAssert.assertThat(
            Solution().minMovesToSeat(intArrayOf(4, 1, 5, 9), intArrayOf(1, 3, 2, 6)),
            CoreMatchers.equalTo(7)
        )
    }

    @Test
    fun minMovesToSeat3() {
        MatcherAssert.assertThat(
            Solution().minMovesToSeat(intArrayOf(2, 2, 6, 6), intArrayOf(1, 3, 2, 6)),
            CoreMatchers.equalTo(4)
        )
    }
}
