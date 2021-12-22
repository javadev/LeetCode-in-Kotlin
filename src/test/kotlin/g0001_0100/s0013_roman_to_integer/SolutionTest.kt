package g0001_0100.s0013_roman_to_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

import org.junit.Test

class SolutionTest {
    @Test
    fun romanToInt() {
        val solution = Solution()
        assertThat(solution.romanToInt("III"), equalTo(3))
        assertThat(solution.romanToInt("IV"), equalTo(4))
        assertThat(solution.romanToInt("IX"), equalTo(9))
        assertThat(solution.romanToInt("LVIII"), equalTo(58))
        assertThat(solution.romanToInt("MCMXCIV"), equalTo(1994))
    }

}