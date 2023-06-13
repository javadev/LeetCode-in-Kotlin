package g1501_1600.s1561_maximum_number_of_coins_you_can_get

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCoins() {
        MatcherAssert.assertThat(Solution().maxCoins(intArrayOf(2, 4, 1, 2, 7, 8)), CoreMatchers.equalTo(9))
    }

    @Test
    fun maxCoins2() {
        MatcherAssert.assertThat(Solution().maxCoins(intArrayOf(2, 4, 5)), CoreMatchers.equalTo(4))
    }

    @Test
    fun maxCoins3() {
        MatcherAssert.assertThat(Solution().maxCoins(intArrayOf(9, 8, 7, 6, 5, 1, 2, 3, 4)), CoreMatchers.equalTo(18))
    }
}
