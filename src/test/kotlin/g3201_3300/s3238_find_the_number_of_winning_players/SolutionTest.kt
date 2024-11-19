package g3201_3300.s3238_find_the_number_of_winning_players

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun winningPlayerCount() {
        assertThat(
            Solution()
                .winningPlayerCount(
                    4,
                    arrayOf(
                        intArrayOf(0, 0),
                        intArrayOf(1, 0),
                        intArrayOf(1, 0),
                        intArrayOf(2, 1),
                        intArrayOf(2, 1),
                        intArrayOf(2, 0),
                    ),
                ),
            equalTo(2),
        )
    }

    @Test
    fun winningPlayerCount2() {
        assertThat(
            Solution().winningPlayerCount(
                5,
                arrayOf(intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4)),
            ),
            equalTo(0),
        )
    }

    @Test
    fun winningPlayerCount3() {
        assertThat(
            Solution().winningPlayerCount(
                5,
                arrayOf(intArrayOf(1, 1), intArrayOf(2, 4), intArrayOf(2, 4), intArrayOf(2, 4)),
            ),
            equalTo(1),
        )
    }
}
