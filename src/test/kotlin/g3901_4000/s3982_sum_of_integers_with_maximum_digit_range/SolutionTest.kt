package g3901_4000.s3982_sum_of_integers_with_maximum_digit_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDigitRange() {
        assertThat<Int>(
            Solution().maxDigitRange(intArrayOf(5724, 111, 350)),
            equalTo<Int>(6074),
        )
    }

    @Test
    fun maxDigitRange2() {
        assertThat<Int>(Solution().maxDigitRange(intArrayOf(90, 900)), equalTo<Int>(990))
    }

    @Test
    fun maxDigitRange3() {
        assertThat<Int>(Solution().maxDigitRange(intArrayOf(11, 22, 33)), equalTo<Int>(66))
    }
}
