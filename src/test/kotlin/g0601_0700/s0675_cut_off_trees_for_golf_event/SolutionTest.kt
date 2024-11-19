package g0601_0700.s0675_cut_off_trees_for_golf_event

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun cutOffTree() {
        val input = listOf(
            listOf(1, 2, 3),
            listOf(0, 0, 4),
            listOf(7, 6, 5),
        )
        assertThat(Solution().cutOffTree(input), equalTo(6))
    }

    @Test
    fun cutOffTree2() {
        val input = listOf(
            listOf(1, 2, 3),
            listOf(0, 0, 0),
            listOf(7, 6, 5),
        )
        assertThat(Solution().cutOffTree(input), equalTo(-1))
    }

    @Test
    fun cutOffTree3() {
        val input = listOf(
            listOf(2, 3, 4),
            listOf(0, 0, 5),
            listOf(8, 7, 6),
        )
        assertThat(Solution().cutOffTree(input), equalTo(6))
    }
}
