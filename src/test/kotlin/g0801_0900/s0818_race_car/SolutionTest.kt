package g0801_0900.s0818_race_car

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun raceCar() {
        assertThat(Solution().racecar(3), equalTo(2))
    }

    @Test
    fun raceCar2() {
        assertThat(Solution().racecar(6), equalTo(5))
    }
}
