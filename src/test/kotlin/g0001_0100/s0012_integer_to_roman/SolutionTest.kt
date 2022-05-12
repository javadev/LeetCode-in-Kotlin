package g0001_0100.s0012_integer_to_roman

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun intToRoman() {
        assertThat(Solution().intToRoman(3), equalTo("III"))
    }

    @Test
    fun intToRoman2() {
        assertThat(Solution().intToRoman(4), equalTo("IV"))
    }

    @Test
    fun intToRoman3() {
        assertThat(Solution().intToRoman(9), equalTo("IX"))
    }

    @Test
    fun intToRoman4() {
        assertThat(Solution().intToRoman(58), equalTo("LVIII"))
    }

    @Test
    fun intToRoman5() {
        assertThat(Solution().intToRoman(1994), equalTo("MCMXCIV"))
    }
}
