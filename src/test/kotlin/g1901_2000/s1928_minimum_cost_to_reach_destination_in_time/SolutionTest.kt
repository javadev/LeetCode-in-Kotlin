package g1901_2000.s1928_minimum_cost_to_reach_destination_in_time

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(
            Solution()
                .minCost(
                    30,
                    arrayOf(
                        intArrayOf(0, 1, 10),
                        intArrayOf(1, 2, 10),
                        intArrayOf(2, 5, 10),
                        intArrayOf(0, 3, 1),
                        intArrayOf(3, 4, 10),
                        intArrayOf(4, 5, 15),
                    ),
                    intArrayOf(5, 1, 2, 20, 20, 3),
                ),
            equalTo(11),
        )
    }

    @Test
    fun minCost2() {
        assertThat(
            Solution()
                .minCost(
                    29,
                    arrayOf(
                        intArrayOf(0, 1, 10),
                        intArrayOf(1, 2, 10),
                        intArrayOf(2, 5, 10),
                        intArrayOf(0, 3, 1),
                        intArrayOf(3, 4, 10),
                        intArrayOf(4, 5, 15),
                    ),
                    intArrayOf(5, 1, 2, 20, 20, 3),
                ),
            equalTo(48),
        )
    }

    @Test
    fun minCost3() {
        assertThat(
            Solution()
                .minCost(
                    25,
                    arrayOf(
                        intArrayOf(0, 1, 10),
                        intArrayOf(1, 2, 10),
                        intArrayOf(2, 5, 10),
                        intArrayOf(0, 3, 1),
                        intArrayOf(3, 4, 10),
                        intArrayOf(4, 5, 15),
                    ),
                    intArrayOf(5, 1, 2, 20, 20, 3),
                ),
            equalTo(-1),
        )
    }
}
