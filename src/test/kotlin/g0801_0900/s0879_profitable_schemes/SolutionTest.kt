package g0801_0900.s0879_profitable_schemes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun profitableSchemes() {
        assertThat(
            Solution().profitableSchemes(5, 3, intArrayOf(2, 2), intArrayOf(2, 3)),
            equalTo(2),
        )
    }

    @Test
    fun profitableSchemes2() {
        assertThat(
            Solution().profitableSchemes(10, 5, intArrayOf(2, 3, 5), intArrayOf(6, 7, 8)),
            equalTo(7),
        )
    }
}
