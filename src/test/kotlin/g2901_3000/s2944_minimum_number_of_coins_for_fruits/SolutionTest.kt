package g2901_3000.s2944_minimum_number_of_coins_for_fruits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCoins() {
        assertThat(Solution().minimumCoins(intArrayOf(3, 1, 2)), equalTo(4))
    }

    @Test
    fun minimumCoins2() {
        assertThat(Solution().minimumCoins(intArrayOf(1, 10, 1, 1)), equalTo(2))
    }
}
