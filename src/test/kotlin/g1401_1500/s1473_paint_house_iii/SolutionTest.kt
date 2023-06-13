package g1401_1500.s1473_paint_house_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(
            Solution()
                .minCost(
                    intArrayOf(0, 0, 0, 0, 0),
                    arrayOf(
                        intArrayOf(1, 10),
                        intArrayOf(10, 1),
                        intArrayOf(10, 1),
                        intArrayOf(1, 10),
                        intArrayOf(5, 1)
                    ),
                    5,
                    2,
                    3
                ),
            equalTo(9)
        )
    }

    @Test
    fun minCost2() {
        assertThat(
            Solution()
                .minCost(
                    intArrayOf(0, 2, 1, 2, 0),
                    arrayOf(
                        intArrayOf(1, 10),
                        intArrayOf(10, 1),
                        intArrayOf(10, 1),
                        intArrayOf(1, 10),
                        intArrayOf(5, 1)
                    ),
                    5,
                    2,
                    3
                ),
            equalTo(11)
        )
    }

    @Test
    fun minCost3() {
        assertThat(
            Solution()
                .minCost(
                    intArrayOf(3, 1, 2, 3),
                    arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1)),
                    4,
                    3,
                    3
                ),
            equalTo(-1)
        )
    }
}
