package g1701_1800.s1796_second_largest_digit_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun secondHighest() {
        assertThat(Solution().secondHighest("dfa12321afd"), equalTo(2))
    }

    @Test
    fun secondHighest2() {
        assertThat(Solution().secondHighest("abc1111"), equalTo(-1))
    }
}
