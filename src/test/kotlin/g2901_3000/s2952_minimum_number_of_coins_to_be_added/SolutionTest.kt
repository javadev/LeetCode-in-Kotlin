package g2901_3000.s2952_minimum_number_of_coins_to_be_added

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumAddedCoins() {
        assertThat(Solution().minimumAddedCoins(intArrayOf(1, 4, 10), 19), equalTo(2))
    }

    @Test
    fun minimumAddedCoins2() {
        assertThat(
            Solution().minimumAddedCoins(intArrayOf(1, 4, 10, 5, 7, 19), 19),
            equalTo(1),
        )
    }

    @Test
    fun minimumAddedCoins3() {
        assertThat(Solution().minimumAddedCoins(intArrayOf(1, 1, 1), 20), equalTo(3))
    }
}
