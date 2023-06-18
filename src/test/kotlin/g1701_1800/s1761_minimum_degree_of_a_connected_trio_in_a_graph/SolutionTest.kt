package g1701_1800.s1761_minimum_degree_of_a_connected_trio_in_a_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTrioDegree() {
        assertThat(
            Solution()
                .minTrioDegree(
                    6,
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(3, 2),
                        intArrayOf(4, 1), intArrayOf(5, 2), intArrayOf(3, 6)
                    )
                ),
            equalTo(3)
        )
    }

    @Test
    fun minTrioDegree2() {
        assertThat(
            Solution()
                .minTrioDegree(
                    7,
                    arrayOf(
                        intArrayOf(1, 3), intArrayOf(4, 1), intArrayOf(4, 3),
                        intArrayOf(2, 5), intArrayOf(5, 6), intArrayOf(6, 7), intArrayOf(7, 5),
                        intArrayOf(2, 6)
                    )
                ),
            equalTo(0)
        )
    }
}
