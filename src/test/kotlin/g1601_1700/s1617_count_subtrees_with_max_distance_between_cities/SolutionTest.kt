package g1601_1700.s1617_count_subtrees_with_max_distance_between_cities

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubgraphsForEachDiameter() {
        MatcherAssert.assertThat(
            Solution()
                .countSubgraphsForEachDiameter(4, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 4))),
            CoreMatchers.equalTo(intArrayOf(3, 4, 0))
        )
    }

    @Test
    fun countSubgraphsForEachDiameter2() {
        MatcherAssert.assertThat(
            Solution().countSubgraphsForEachDiameter(2, arrayOf(intArrayOf(1, 2))),
            CoreMatchers.equalTo(intArrayOf(1))
        )
    }

    @Test
    fun countSubgraphsForEachDiameter3() {
        MatcherAssert.assertThat(
            Solution().countSubgraphsForEachDiameter(3, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))),
            CoreMatchers.equalTo(intArrayOf(2, 1))
        )
    }
}
