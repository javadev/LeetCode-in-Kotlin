package g2501_2600.s2544_alternating_digit_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun alternateDigitSum() {
        assertThat(Solution().alternateDigitSum(521), equalTo(4))
    }

    @Test
    fun alternateDigitSum2() {
        assertThat(Solution().alternateDigitSum(111), equalTo(1))
    }

    @Test
    fun alternateDigitSum3() {
        assertThat(Solution().alternateDigitSum(886996), equalTo(0))
    }
}
