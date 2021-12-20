package s0012_integer_to_roman

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

import org.junit.Test

class SolutionTest {
    @Test
    fun intToRoman() {
        val solution = Solution()
        assertThat(solution.intToRoman(3), equalTo("III"))
        assertThat(solution.intToRoman(4), equalTo("IV"))
        assertThat(solution.intToRoman(9), equalTo("IX"))
        assertThat(solution.intToRoman(58), equalTo("LVIII"))
        assertThat(solution.intToRoman(1994), equalTo("MCMXCIV"))
    }
}