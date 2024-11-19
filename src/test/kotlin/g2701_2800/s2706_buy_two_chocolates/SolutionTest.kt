package g2701_2800.s2706_buy_two_chocolates

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun buyChoco() {
        assertThat(
            Solution().buyChoco(intArrayOf(1, 2, 2), 3),
            equalTo(0),
        )
    }

    @Test
    fun buyChoco2() {
        assertThat(
            Solution().buyChoco(intArrayOf(3, 2, 3), 3),
            equalTo(3),
        )
    }
}
