package g2301_2400.s2363_merge_similar_items

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeSimilarItems() {
        assertThat(
            Solution()
                .mergeSimilarItems(
                    arrayOf(intArrayOf(1, 1), intArrayOf(4, 5), intArrayOf(3, 8)),
                    arrayOf(intArrayOf(3, 1), intArrayOf(1, 5)),
                ),
            equalTo(
                listOf(
                    mutableListOf(1, 6),
                    mutableListOf(3, 9),
                    mutableListOf(4, 5),
                ),
            ),
        )
    }

    @Test
    fun mergeSimilarItems2() {
        assertThat(
            Solution()
                .mergeSimilarItems(
                    arrayOf(intArrayOf(1, 1), intArrayOf(3, 2), intArrayOf(2, 3)),
                    arrayOf(intArrayOf(2, 1), intArrayOf(3, 2), intArrayOf(1, 3)),
                ),
            equalTo(
                listOf(
                    mutableListOf(1, 4),
                    mutableListOf(2, 4),
                    mutableListOf(3, 4),
                ),
            ),
        )
    }

    @Test
    fun mergeSimilarItems3() {
        assertThat(
            Solution()
                .mergeSimilarItems(
                    arrayOf(intArrayOf(1, 3), intArrayOf(2, 2)),
                    arrayOf(intArrayOf(7, 1), intArrayOf(2, 2), intArrayOf(1, 4)),
                ),
            equalTo(
                listOf(mutableListOf(1, 7), mutableListOf(2, 4), mutableListOf(7, 1)),
            ),
        )
    }
}
