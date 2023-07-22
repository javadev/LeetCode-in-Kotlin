package g0301_0400.s0374_guess_number_higher_or_lower

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun guessNumber() {
        assertThat(Solution().guessNumber(10), equalTo(7))
    }

    @Test
    fun guessNumber2() {
        assertThat(Solution().guessNumber(1), equalTo(-1))
    }

    @Test
    fun guessNumber3() {
        assertThat(Solution().guessNumber(2), equalTo(-1))
    }

    @Test
    fun guessNumber4() {
        assertThat(Solution().guessNumber(6), equalTo(-1))
    }
}
