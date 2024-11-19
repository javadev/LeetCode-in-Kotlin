package g0801_0900.s0834_sum_of_distances_in_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfDistancesInTree() {
        assertThat(
            Solution()
                .sumOfDistancesInTree(
                    6,
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(2, 4), intArrayOf(2, 5)),
                ),
            equalTo(intArrayOf(8, 12, 6, 10, 10, 10)),
        )
    }

    @Test
    fun sumOfDistancesInTree2() {
        assertThat(Solution().sumOfDistancesInTree(1, arrayOf()), equalTo(intArrayOf(0)))
    }

    @Test
    fun sumOfDistancesInTree3() {
        assertThat(
            Solution().sumOfDistancesInTree(2, arrayOf(intArrayOf(1, 0))),
            equalTo(intArrayOf(1, 1)),
        )
    }
}
