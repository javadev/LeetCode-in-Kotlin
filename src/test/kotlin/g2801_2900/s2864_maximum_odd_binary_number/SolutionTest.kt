package g2801_2900.s2864_maximum_odd_binary_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumOddBinaryNumber() {
        assertThat(Solution().maximumOddBinaryNumber("010"), equalTo("001"))
    }

    @Test
    fun maximumOddBinaryNumber2() {
        assertThat(Solution().maximumOddBinaryNumber("0101"), equalTo("1001"))
    }
}
