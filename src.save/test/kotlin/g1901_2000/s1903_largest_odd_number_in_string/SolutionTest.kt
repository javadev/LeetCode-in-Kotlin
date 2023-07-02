package g1901_2000.s1903_largest_odd_number_in_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestOddNumber() {
        assertThat(Solution().largestOddNumber("52"), equalTo("5"))
    }

    @Test
    fun largestOddNumber2() {
        assertThat(Solution().largestOddNumber("4206"), equalTo(""))
    }

    @Test
    fun largestOddNumber3() {
        assertThat(Solution().largestOddNumber("35427"), equalTo("35427"))
    }
}
