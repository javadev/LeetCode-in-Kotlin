package g1201_1300.s1227_airplane_seat_assignment_probability

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nthPersonGetsNthSeat() {
        assertThat(Solution().nthPersonGetsNthSeat(1), equalTo(1.000))
    }

    @Test
    fun nthPersonGetsNthSeat2() {
        assertThat(Solution().nthPersonGetsNthSeat(2), equalTo(0.50000))
    }
}
