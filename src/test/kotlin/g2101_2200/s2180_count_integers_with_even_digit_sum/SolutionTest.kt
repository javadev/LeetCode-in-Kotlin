package g2101_2200.s2180_count_integers_with_even_digit_sum

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countEven() {
        MatcherAssert.assertThat(Solution().countEven(4), CoreMatchers.equalTo(2))
    }

    @Test
    fun countEven2() {
        MatcherAssert.assertThat(Solution().countEven(30), CoreMatchers.equalTo(14))
    }

    @Test
    fun countEven3() {
        MatcherAssert.assertThat(Solution().countEven(11), CoreMatchers.equalTo(5))
    }
}
