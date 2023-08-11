package g1701_1800.s1742_maximum_number_of_balls_in_a_box

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBalls() {
        assertThat(Solution().countBalls(1, 10), equalTo(2))
    }

    @Test
    fun countBalls2() {
        assertThat(Solution().countBalls(5, 15), equalTo(2))
    }

    @Test
    fun countBalls3() {
        assertThat(Solution().countBalls(19, 28), equalTo(2))
    }
}
