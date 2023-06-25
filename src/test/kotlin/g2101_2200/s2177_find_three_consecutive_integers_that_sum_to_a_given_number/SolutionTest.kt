package g2101_2200.s2177_find_three_consecutive_integers_that_sum_to_a_given_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfThree() {
        MatcherAssert.assertThat(Solution().sumOfThree(33L), CoreMatchers.equalTo(longArrayOf(10, 11, 12)))
    }

    @Test
    fun sumOfThree2() {
        MatcherAssert.assertThat(Solution().sumOfThree(4L), CoreMatchers.equalTo(LongArray(0)))
    }
}
