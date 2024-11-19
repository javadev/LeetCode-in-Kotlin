package g2101_2200.s2146_k_highest_ranked_items_within_a_price_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun highestRankedKItems() {
        assertThat(
            Solution()
                .highestRankedKItems(
                    arrayOf(intArrayOf(1, 2, 0, 1), intArrayOf(1, 3, 0, 1), intArrayOf(0, 2, 5, 1)),
                    intArrayOf(2, 5),
                    intArrayOf(0, 0),
                    3,
                ),
            equalTo(
                listOf(mutableListOf(0, 1), mutableListOf(1, 1), mutableListOf(2, 1)),
            ),
        )
    }

    @Test
    fun highestRankedKItems2() {
        assertThat(
            Solution()
                .highestRankedKItems(
                    arrayOf(intArrayOf(1, 2, 0, 1), intArrayOf(1, 3, 3, 1), intArrayOf(0, 2, 5, 1)),
                    intArrayOf(2, 3),
                    intArrayOf(2, 3),
                    2,
                ),
            equalTo(listOf(mutableListOf(2, 1), mutableListOf(1, 2))),
        )
    }

    @Test
    fun highestRankedKItems3() {
        assertThat(
            Solution()
                .highestRankedKItems(
                    arrayOf(intArrayOf(1, 1, 1), intArrayOf(0, 0, 1), intArrayOf(2, 3, 4)),
                    intArrayOf(2, 3),
                    intArrayOf(0, 0),
                    3,
                ),
            equalTo(listOf(mutableListOf(2, 1), mutableListOf(2, 0))),
        )
    }
}
