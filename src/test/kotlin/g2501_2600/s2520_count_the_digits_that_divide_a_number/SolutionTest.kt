package g2501_2600.s2520_count_the_digits_that_divide_a_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDigits() {
        assertThat(Solution().countDigits(7), equalTo(1))
    }

    @Test
    fun countDigits2() {
        assertThat(Solution().countDigits(121), equalTo(2))
    }

    @Test
    fun countDigits3() {
        assertThat(Solution().countDigits(1248), equalTo(4))
    }
}
