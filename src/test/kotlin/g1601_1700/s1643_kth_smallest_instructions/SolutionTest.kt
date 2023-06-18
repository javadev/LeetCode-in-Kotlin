package g1601_1700.s1643_kth_smallest_instructions

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallestPath() {
        MatcherAssert.assertThat(Solution().kthSmallestPath(intArrayOf(2, 3), 1), CoreMatchers.equalTo("HHHVV"))
    }

    @Test
    fun kthSmallestPath2() {
        MatcherAssert.assertThat(Solution().kthSmallestPath(intArrayOf(2, 3), 2), CoreMatchers.equalTo("HHVHV"))
    }

    @Test
    fun kthSmallestPath3() {
        MatcherAssert.assertThat(Solution().kthSmallestPath(intArrayOf(2, 3), 3), CoreMatchers.equalTo("HHVVH"))
    }
}
