package g3401_3500.s3419_minimize_the_maximum_edge_weight_of_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMaxWeight() {
        assertThat<Int>(
            Solution()
                .minMaxWeight(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(1, 0, 1),
                        intArrayOf(2, 0, 2),
                        intArrayOf(3, 0, 1),
                        intArrayOf(4, 3, 1),
                        intArrayOf(2, 1, 1),
                    ),
                    2,
                ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minMaxWeight2() {
        assertThat<Int>(
            Solution()
                .minMaxWeight(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 1),
                        intArrayOf(0, 2, 2),
                        intArrayOf(0, 3, 1),
                        intArrayOf(0, 4, 1),
                        intArrayOf(1, 2, 1),
                        intArrayOf(1, 4, 1),
                    ),
                    1,
                ),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minMaxWeight3() {
        assertThat<Int>(
            Solution()
                .minMaxWeight(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(1, 2, 1),
                        intArrayOf(1, 3, 3),
                        intArrayOf(1, 4, 5),
                        intArrayOf(2, 3, 2),
                        intArrayOf(3, 4, 2),
                        intArrayOf(4, 0, 1),
                    ),
                    1,
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minMaxWeight4() {
        assertThat<Int>(
            Solution()
                .minMaxWeight(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(1, 2, 1),
                        intArrayOf(1, 3, 3),
                        intArrayOf(1, 4, 5),
                        intArrayOf(2, 3, 2),
                        intArrayOf(4, 0, 1),
                    ),
                    1,
                ),
            equalTo<Int>(-1),
        )
    }
}
