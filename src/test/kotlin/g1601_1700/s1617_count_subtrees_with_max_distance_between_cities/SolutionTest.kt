package g1601_1700.s1617_count_subtrees_with_max_distance_between_cities

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubgraphsForEachDiameter() {
        assertThat(
            Solution()
                .countSubgraphsForEachDiameter(4, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 4))),
            equalTo(intArrayOf(3, 4, 0))
        )
    }

    @Test
    fun countSubgraphsForEachDiameter2() {
        assertThat(
            Solution().countSubgraphsForEachDiameter(2, arrayOf(intArrayOf(1, 2))),
            equalTo(intArrayOf(1))
        )
    }

    @Test
    fun countSubgraphsForEachDiameter3() {
        assertThat(
            Solution().countSubgraphsForEachDiameter(3, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))),
            equalTo(intArrayOf(2, 1))
        )
    }
}
