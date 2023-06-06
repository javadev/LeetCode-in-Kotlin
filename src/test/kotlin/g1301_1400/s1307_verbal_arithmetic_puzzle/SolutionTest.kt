package g1301_1400.s1307_verbal_arithmetic_puzzle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSolvable() {
        assertThat(
            Solution().isSolvable(arrayOf("SEND", "MORE"), "MONEY"), equalTo(true)
        )
    }

    @Test
    fun isSolvable2() {
        assertThat(
            Solution().isSolvable(arrayOf("SIX", "SEVEN", "SEVEN"), "TWENTY"),
            equalTo(true)
        )
    }

    @Test
    fun isSolvable3() {
        assertThat(
            Solution().isSolvable(arrayOf("LEET", "CODE"), "POINT"), equalTo(false)
        )
    }
}
