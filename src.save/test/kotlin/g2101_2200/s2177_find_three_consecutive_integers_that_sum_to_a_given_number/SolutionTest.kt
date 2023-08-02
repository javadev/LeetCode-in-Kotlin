package g2101_2200.s2177_find_three_consecutive_integers_that_sum_to_a_given_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfThree() {
        assertThat(Solution().sumOfThree(33L), equalTo(longArrayOf(10, 11, 12)))
    }

    @Test
    fun sumOfThree2() {
        assertThat(Solution().sumOfThree(4L), equalTo(LongArray(0)))
    }
}
