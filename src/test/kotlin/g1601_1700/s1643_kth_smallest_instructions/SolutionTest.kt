package g1601_1700.s1643_kth_smallest_instructions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallestPath() {
        assertThat(Solution().kthSmallestPath(intArrayOf(2, 3), 1), equalTo("HHHVV"))
    }

    @Test
    fun kthSmallestPath2() {
        assertThat(Solution().kthSmallestPath(intArrayOf(2, 3), 2), equalTo("HHVHV"))
    }

    @Test
    fun kthSmallestPath3() {
        assertThat(Solution().kthSmallestPath(intArrayOf(2, 3), 3), equalTo("HHVVH"))
    }
}
