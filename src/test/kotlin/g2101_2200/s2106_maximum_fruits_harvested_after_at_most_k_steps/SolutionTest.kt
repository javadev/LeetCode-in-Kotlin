package g2101_2200.s2106_maximum_fruits_harvested_after_at_most_k_steps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTotalFruits() {
        assertThat(
            Solution().maxTotalFruits(arrayOf(intArrayOf(2, 8), intArrayOf(6, 3), intArrayOf(8, 6)), 5, 4),
            equalTo(9),
        )
    }

    @Test
    fun maxTotalFruits2() {
        assertThat(
            Solution()
                .maxTotalFruits(
                    arrayOf(
                        intArrayOf(0, 9),
                        intArrayOf(4, 1),
                        intArrayOf(5, 7),
                        intArrayOf(6, 2),
                        intArrayOf(7, 4),
                        intArrayOf(10, 9),
                    ),
                    5,
                    4,
                ),
            equalTo(14),
        )
    }

    @Test
    fun maxTotalFruits3() {
        assertThat(
            Solution().maxTotalFruits(arrayOf(intArrayOf(0, 3), intArrayOf(6, 4), intArrayOf(8, 5)), 3, 2),
            equalTo(0),
        )
    }
}
