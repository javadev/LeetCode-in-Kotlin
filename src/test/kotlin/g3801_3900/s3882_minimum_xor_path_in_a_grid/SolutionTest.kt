package g3801_3900.s3882_minimum_xor_path_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Int>(
            Solution().minCost(arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo<Int>(6),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Int>(
            Solution().minCost(arrayOf<IntArray>(intArrayOf(6, 7), intArrayOf(5, 8))),
            equalTo<Int>(9),
        )
    }

    @Test
    fun minCost3() {
        assertThat<Int>(
            Solution().minCost(arrayOf<IntArray>(intArrayOf(2, 7, 5))),
            equalTo<Int>(0),
        )
    }
}
