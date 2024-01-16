package g2901_3000.s2952_minimum_number_of_coins_to_be_added

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumAddedCoins() {
        MatcherAssert.assertThat(Solution().minimumAddedCoins(intArrayOf(1, 4, 10), 19), CoreMatchers.equalTo(2))
    }

    @Test
    fun minimumAddedCoins2() {
        MatcherAssert.assertThat(
            Solution().minimumAddedCoins(intArrayOf(1, 4, 10, 5, 7, 19), 19), CoreMatchers.equalTo(1)
        )
    }

    @Test
    fun minimumAddedCoins3() {
        MatcherAssert.assertThat(Solution().minimumAddedCoins(intArrayOf(1, 1, 1), 20), CoreMatchers.equalTo(3))
    }
}
