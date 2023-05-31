package g1001_1100.s1071_greatest_common_divisor_of_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gcdOfStrings() {
        assertThat(Solution().gcdOfStrings("ABCABC", "ABC"), equalTo("ABC"))
    }

    @Test
    fun gcdOfStrings2() {
        assertThat(Solution().gcdOfStrings("ABABAB", "ABAB"), equalTo("AB"))
    }

    @Test
    fun gcdOfStrings3() {
        assertThat(Solution().gcdOfStrings("LEET", "CODE"), equalTo(""))
    }
}
