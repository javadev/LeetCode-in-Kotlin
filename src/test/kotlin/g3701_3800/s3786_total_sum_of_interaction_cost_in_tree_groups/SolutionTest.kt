package g3701_3800.s3786_total_sum_of_interaction_cost_in_tree_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun interactionCosts() {
        assertThat<Long>(
            Solution()
                .interactionCosts(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)), intArrayOf(1, 1, 1)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun interactionCosts2() {
        assertThat<Long>(
            Solution()
                .interactionCosts(3, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)), intArrayOf(3, 2, 3)),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun interactionCosts3() {
        assertThat<Long>(
            Solution()
                .interactionCosts(
                    4,
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3)),
                    intArrayOf(1, 1, 4, 4),
                ),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun interactionCosts4() {
        assertThat<Long>(
            Solution().interactionCosts(2, arrayOf<IntArray>(intArrayOf(0, 1)), intArrayOf(9, 8)),
            equalTo<Long>(0L),
        )
    }
}
