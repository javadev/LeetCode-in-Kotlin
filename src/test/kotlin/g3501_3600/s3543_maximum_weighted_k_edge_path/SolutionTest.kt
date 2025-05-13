package g3501_3600.s3543_maximum_weighted_k_edge_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWeight() {
        assertThat(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 2, 2)), 2, 4),
            equalTo(3),
        )
    }

    @Test
    fun maxWeight2() {
        assertThat(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 2), intArrayOf(0, 2, 3)), 1, 3),
            equalTo(2),
        )
    }

    @Test
    fun maxWeight3() {
        assertThat(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 6), intArrayOf(1, 2, 8)), 1, 6),
            equalTo(-1),
        )
    }

    @Test
    fun maxWeight4() {
        assertThat(
            Solution().maxWeight(3, arrayOf<IntArray>(intArrayOf(0, 1, 6), intArrayOf(1, 2, 8)), 0, 6),
            equalTo(0),
        )
    }

    @Test
    fun maxWeight5() {
        assertThat(
            Solution()
                .maxWeight(
                    6,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 10),
                        intArrayOf(0, 2, 1),
                        intArrayOf(1, 3, 2),
                        intArrayOf(2, 3, 5),
                        intArrayOf(3, 4, 5),
                        intArrayOf(3, 5, 3),
                    ),
                    3,
                    12,
                ),
            equalTo(11),
        )
    }

    @Test
    fun maxWeight6() {
        assertThat(
            Solution()
                .maxWeight(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 2),
                        intArrayOf(0, 2, 3),
                        intArrayOf(1, 3, 3),
                        intArrayOf(2, 3, 1),
                        intArrayOf(3, 4, 2),
                    ),
                    3,
                    7,
                ),
            equalTo(6),
        )
    }
}
