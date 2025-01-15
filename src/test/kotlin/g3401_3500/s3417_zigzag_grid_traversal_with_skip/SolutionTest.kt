package g3401_3500.s3417_zigzag_grid_traversal_with_skip

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun zigzagTraversal() {
        assertThat<List<Int>>(
            Solution().zigzagTraversal(arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo<List<Int>>(listOf<Int>(1, 4)),
        )
    }

    @Test
    fun zigzagTraversal2() {
        assertThat<List<Int>>(
            Solution().zigzagTraversal(arrayOf<IntArray>(intArrayOf(2, 1), intArrayOf(2, 1), intArrayOf(2, 1))),
            equalTo<List<Int>>(listOf<Int>(2, 1, 2)),
        )
    }

    @Test
    fun zigzagTraversal3() {
        assertThat<List<Int>>(
            Solution().zigzagTraversal(
                arrayOf<IntArray>(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9),
                ),
            ),
            equalTo<List<Int>>(listOf<Int>(1, 3, 5, 7, 9)),
        )
    }
}
