package g1301_1400.s1307_verbal_arithmetic_puzzle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isSolvable: Unit
        get() {
            assertThat(
                Solution().isSolvable(arrayOf("SEND", "MORE"), "MONEY"), equalTo(true)
            )
        }

    @get:Test
    val isSolvable2: Unit
        get() {
            assertThat(
                Solution().isSolvable(arrayOf("SIX", "SEVEN", "SEVEN"), "TWENTY"),
                equalTo(true)
            )
        }

    @get:Test
    val isSolvable3: Unit
        get() {
            assertThat(
                Solution().isSolvable(arrayOf("LEET", "CODE"), "POINT"), equalTo(false)
            )
        }
}
