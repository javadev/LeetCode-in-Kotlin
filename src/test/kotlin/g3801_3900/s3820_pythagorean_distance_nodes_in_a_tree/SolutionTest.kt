package g3801_3900.s3820_pythagorean_distance_nodes_in_a_tree

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun specialNodes() {
        assertThat<Int>(
            Solution().specialNodes(
                4,
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3)),
                1,
                2,
                3,
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun specialNodes2() {
        assertThat<Int>(
            Solution().specialNodes(
                4,
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3)),
                0,
                3,
                2,
            ),
            equalTo<Int>(0),
        )
    }

    @Test
    fun specialNodes3() {
        assertThat<Int>(
            Solution().specialNodes(
                4,
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3)),
                1,
                3,
                0,
            ),
            equalTo<Int>(1),
        )
    }
}
