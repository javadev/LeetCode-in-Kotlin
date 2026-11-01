package g3901_4000.s3910_count_connected_subgraphs_with_even_node_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun evenSumSubgraphs() {
        assertThat<Int>(
            Solution().evenSumSubgraphs(intArrayOf(1, 0, 1), arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2))),
            equalTo<Int>(2),
        )
    }

    @Test
    fun evenSumSubgraphs2() {
        assertThat<Int>(
            Solution().evenSumSubgraphs(intArrayOf(1), arrayOf<IntArray>()),
            equalTo<Int>(0),
        )
    }

    @Test
    fun evenSumSubgraphs3() {
        assertThat<Int>(
            Solution().evenSumSubgraphs(intArrayOf(0), arrayOf<IntArray>()),
            equalTo<Int>(1),
        )
    }

    @Test
    fun evenSumSubgraphs4() {
        assertThat<Int>(
            Solution().evenSumSubgraphs(intArrayOf(0, 1, 0), arrayOf<IntArray>()),
            equalTo<Int>(2),
        )
    }

    @Test
    fun evenSumSubgraphs5() {
        assertThat<Int>(
            Solution()
                .evenSumSubgraphs(
                    intArrayOf(0, 0, 0),
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)),
                ),
            equalTo<Int>(7),
        )
    }

    @Test
    fun evenSumSubgraphs6() {
        assertThat<Int>(
            Solution()
                .evenSumSubgraphs(
                    intArrayOf(1, 1, 1),
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)),
                ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun evenSumSubgraphs7() {
        assertThat<Int>(
            Solution()
                .evenSumSubgraphs(intArrayOf(1, 1, 0, 0), arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(2, 3))),
            equalTo<Int>(4),
        )
    }
}
