package g2001_2100.s2042_check_if_numbers_are_ascending_in_a_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areNumbersAscending() {
        assertThat(
            Solution()
                .areNumbersAscending(
                    "1 box has 3 blue 4 red 6 green and 12 yellow marbles",
                ),
            equalTo(true),
        )
    }

    @Test
    fun areNumbersAscending2() {
        assertThat(Solution().areNumbersAscending("hello world 5 x 5"), equalTo(false))
    }

    @Test
    fun areNumbersAscending3() {
        assertThat(
            Solution()
                .areNumbersAscending(
                    "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s",
                ),
            equalTo(false),
        )
    }
}
