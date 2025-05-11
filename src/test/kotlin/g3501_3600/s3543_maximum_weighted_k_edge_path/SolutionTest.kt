package g3501_3600.s3543_maximum_weighted_k_edge_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWeight() {
        assertThat<Int>(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 2, 2)), 2, 4),
            equalTo<Int>(3)
        )
    }

    @Test
    fun maxWeight2() {
        assertThat<Int>(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 2), intArrayOf(0, 2, 3)), 1, 3),
            equalTo<Int>(2)
        )
    }

    @Test
    fun maxWeight3() {
        assertThat<Int>(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 6), intArrayOf(1, 2, 8)), 1, 6),
            equalTo<Int>(-1)
        )
    }

    @Test
    fun maxWeight4() {
        assertThat<Int>(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 6), intArrayOf(1, 2, 8)), 0, 6),
            equalTo<Int>(0)
        )
    }
}
