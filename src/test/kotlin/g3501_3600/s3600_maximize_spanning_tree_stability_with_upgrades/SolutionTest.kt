package g3501_3600.s3600_maximize_spanning_tree_stability_with_upgrades

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxStability() {
        assertThat<Int>(
            Solution().maxStability(3, arrayOf<IntArray>(intArrayOf(0, 1, 2, 1), intArrayOf(1, 2, 3, 0)), 1),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxStability2() {
        assertThat<Int>(
            Solution()
                .maxStability(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 4, 0), intArrayOf(1, 2, 3, 0), intArrayOf(0, 2, 1, 0)),
                    2,
                ),
            equalTo<Int>(6),
        )
    }

    @Test
    fun maxStability3() {
        assertThat<Int>(
            Solution()
                .maxStability(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 1, 1), intArrayOf(1, 2, 1, 1), intArrayOf(2, 0, 1, 1)),
                    0,
                ),
            equalTo<Int>(-1),
        )
    }
}
