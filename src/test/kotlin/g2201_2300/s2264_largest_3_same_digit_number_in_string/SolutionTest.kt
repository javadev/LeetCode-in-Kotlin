package g2201_2300.s2264_largest_3_same_digit_number_in_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestGoodInteger() {
        assertThat(Solution().largestGoodInteger("6777133339"), equalTo("777"))
    }

    @Test
    fun largestGoodInteger2() {
        assertThat(Solution().largestGoodInteger("2300019"), equalTo("000"))
    }

    @Test
    fun largestGoodInteger3() {
        assertThat(Solution().largestGoodInteger("42352338"), equalTo(""))
    }
}
