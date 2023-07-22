package g2101_2200.s2180_count_integers_with_even_digit_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countEven() {
        assertThat(Solution().countEven(4), equalTo(2))
    }

    @Test
    fun countEven2() {
        assertThat(Solution().countEven(30), equalTo(14))
    }

    @Test
    fun countEven3() {
        assertThat(Solution().countEven(11), equalTo(5))
    }
}
