package g0601_0700.s0682_baseball_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun calPoints() {
        assertThat(Solution().calPoints(arrayOf("5", "2", "C", "D", "+")), equalTo(30))
    }

    @Test
    fun calPoints2() {
        assertThat(
            Solution().calPoints(arrayOf("5", "-2", "4", "C", "D", "9", "+", "+")),
            equalTo(27),
        )
    }

    @Test
    fun calPoints3() {
        assertThat(Solution().calPoints(arrayOf("1")), equalTo(1))
    }
}
