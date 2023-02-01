package g0001_0100.s0013_roman_to_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun romanToInt() {
        assertThat(Solution().romanToInt("III"), equalTo(3))
    }

    @Test
    fun romanToInt2() {
        assertThat(Solution().romanToInt("IV"), equalTo(4))
    }

    @Test
    fun romanToInt3() {
        assertThat(Solution().romanToInt("IX"), equalTo(9))
    }

    @Test
    fun romanToInt4() {
        assertThat(Solution().romanToInt("LVIII"), equalTo(58))
    }

    @Test
    fun romanToInt5() {
        assertThat(Solution().romanToInt("MCMXCIV"), equalTo(1994))
    }
}
