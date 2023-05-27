package g1001_1100.s1042_flower_planting_with_no_adjacent

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gardenNoAdj() {
        assertThat(
            Solution().gardenNoAdj(3, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 1))),
            equalTo(intArrayOf(1, 2, 3))
        )
    }

    @Test
    fun gardenNoAdj2() {
        assertThat(
            Solution().gardenNoAdj(4, arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo(intArrayOf(1, 2, 1, 2))
        )
    }

    @Test
    fun gardenNoAdj3() {
        assertThat(
            Solution()
                .gardenNoAdj(
                    4,
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(3, 4),
                        intArrayOf(4, 1),
                        intArrayOf(1, 3),
                        intArrayOf(2, 4)
                    )
                ),
            equalTo(intArrayOf(1, 2, 3, 4))
        )
    }
}
