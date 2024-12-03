package g3301_3400.s3373_maximize_the_number_of_target_nodes_after_connecting_trees_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTargetNodes() {
        assertThat<IntArray>(
            Solution()
                .maxTargetNodes(
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(2, 4)),
                    arrayOf<IntArray>(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(0, 3),
                        intArrayOf(2, 7),
                        intArrayOf(1, 4),
                        intArrayOf(4, 5),
                        intArrayOf(4, 6),
                    ),
                ),
            equalTo<IntArray>(intArrayOf(8, 7, 7, 8, 8)),
        )
    }

    @Test
    fun maxTargetNodes2() {
        assertThat<IntArray>(
            Solution()
                .maxTargetNodes(
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(0, 4)),
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3)),
                ),
            equalTo<IntArray>(intArrayOf(3, 6, 6, 6, 6)),
        )
    }
}
