package g3401_3500.s3429_paint_house_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat<Long>(
            Solution().minCost(
                4,
                arrayOf<IntArray>(intArrayOf(3, 5, 7), intArrayOf(6, 2, 9), intArrayOf(4, 8, 1), intArrayOf(7, 3, 5)),
            ),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun minCost2() {
        assertThat<Long>(
            Solution()
                .minCost(
                    6,
                    arrayOf<IntArray>(
                        intArrayOf(2, 4, 6),
                        intArrayOf(5, 3, 8),
                        intArrayOf(7, 1, 9),
                        intArrayOf(4, 6, 2),
                        intArrayOf(3, 5, 7),
                        intArrayOf(8, 2, 4),
                    ),
                ),
            equalTo<Long>(18L),
        )
    }
}
