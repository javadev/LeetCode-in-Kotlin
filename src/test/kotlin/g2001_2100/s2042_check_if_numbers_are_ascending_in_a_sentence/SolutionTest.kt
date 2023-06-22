package g2001_2100.s2042_check_if_numbers_are_ascending_in_a_sentence

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areNumbersAscending() {
        MatcherAssert.assertThat(
            Solution()
                .areNumbersAscending(
                    "1 box has 3 blue 4 red 6 green and 12 yellow marbles"
                ),
            CoreMatchers.equalTo(true)
        )
    }

    @Test
    fun areNumbersAscending2() {
        MatcherAssert.assertThat(Solution().areNumbersAscending("hello world 5 x 5"), CoreMatchers.equalTo(false))
    }

    @Test
    fun areNumbersAscending3() {
        MatcherAssert.assertThat(
            Solution()
                .areNumbersAscending(
                    "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"
                ),
            CoreMatchers.equalTo(false)
        )
    }
}
