package g1501_1600.s1561_maximum_number_of_coins_you_can_get

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCoins() {
        assertThat(Solution().maxCoins(intArrayOf(2, 4, 1, 2, 7, 8)), equalTo(9))
    }

    @Test
    fun maxCoins2() {
        assertThat(Solution().maxCoins(intArrayOf(2, 4, 5)), equalTo(4))
    }

    @Test
    fun maxCoins3() {
        assertThat(Solution().maxCoins(intArrayOf(9, 8, 7, 6, 5, 1, 2, 3, 4)), equalTo(18))
    }
}
