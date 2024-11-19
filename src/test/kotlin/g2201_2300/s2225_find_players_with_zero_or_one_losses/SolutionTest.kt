package g2201_2300.s2225_find_players_with_zero_or_one_losses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findWinners() {
        assertThat(
            Solution()
                .findWinners(
                    arrayOf(
                        intArrayOf(1, 3),
                        intArrayOf(2, 3),
                        intArrayOf(3, 6),
                        intArrayOf(5, 6),
                        intArrayOf(5, 7),
                        intArrayOf(4, 5),
                        intArrayOf(4, 8),
                        intArrayOf(4, 9),
                        intArrayOf(10, 4),
                        intArrayOf(10, 9),
                    ),
                ),
            equalTo(listOf(mutableListOf(1, 2, 10), mutableListOf(4, 5, 7, 8))),
        )
    }

    @Test
    fun findWinners2() {
        assertThat(
            Solution().findWinners(arrayOf(intArrayOf(2, 3), intArrayOf(1, 3), intArrayOf(5, 4), intArrayOf(6, 4))),
            equalTo(listOf(mutableListOf(1, 2, 5, 6), emptyList<Any>())),
        )
    }
}
