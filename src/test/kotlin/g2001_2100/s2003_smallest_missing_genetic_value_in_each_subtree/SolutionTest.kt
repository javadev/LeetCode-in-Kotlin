package g2001_2100.s2003_smallest_missing_genetic_value_in_each_subtree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestMissingValueSubtree() {
        assertThat(
            Solution()
                .smallestMissingValueSubtree(intArrayOf(-1, 0, 0, 2), intArrayOf(1, 2, 3, 4)),
            equalTo(intArrayOf(5, 1, 1, 1)),
        )
    }

    @Test
    fun smallestMissingValueSubtree2() {
        assertThat(
            Solution()
                .smallestMissingValueSubtree(intArrayOf(-1, 0, 1, 0, 3, 3), intArrayOf(5, 4, 6, 2, 1, 3)),
            equalTo(intArrayOf(7, 1, 1, 4, 2, 1)),
        )
    }

    @Test
    fun smallestMissingValueSubtree3() {
        assertThat(
            Solution()
                .smallestMissingValueSubtree(intArrayOf(-1, 2, 3, 0, 2, 4, 1), intArrayOf(2, 3, 4, 5, 6, 7, 8)),
            equalTo(intArrayOf(1, 1, 1, 1, 1, 1, 1)),
        )
    }
}
