package g0401_0500.s0441_arranging_coins

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthNumber() {
        assertThat(Solution().arrangeCoins(5), equalTo(2))
    }

    @Test
    fun arrangeCoins2() {
        assertThat(Solution().arrangeCoins(8), equalTo(3))
    }
}
