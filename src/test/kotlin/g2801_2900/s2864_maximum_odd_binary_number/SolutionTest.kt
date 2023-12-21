package g2801_2900.s2864_maximum_odd_binary_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumOddBinaryNumber() {
        MatcherAssert.assertThat(Solution().maximumOddBinaryNumber("010"), CoreMatchers.equalTo("001"))
    }

    @Test
    fun maximumOddBinaryNumber2() {
        MatcherAssert.assertThat(Solution().maximumOddBinaryNumber("0101"), CoreMatchers.equalTo("1001"))
    }
}
