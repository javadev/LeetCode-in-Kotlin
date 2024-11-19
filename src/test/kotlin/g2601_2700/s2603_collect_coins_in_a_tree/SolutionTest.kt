package g2601_2700.s2603_collect_coins_in_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun collectTheCoins() {
        assertThat(
            Solution().collectTheCoins(
                intArrayOf(1, 0, 0, 0, 0, 1),
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                    intArrayOf(3, 4),
                    intArrayOf(4, 5),
                ),
            ),
            equalTo(2),
        )
    }

    @Test
    fun collectTheCoins2() {
        assertThat(
            Solution().collectTheCoins(
                intArrayOf(0, 0, 0, 1, 1, 0, 0, 1),
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 3),
                    intArrayOf(1, 4),
                    intArrayOf(2, 5),
                    intArrayOf(5, 6),
                    intArrayOf(5, 7),
                ),
            ),
            equalTo(2),
        )
    }
}
