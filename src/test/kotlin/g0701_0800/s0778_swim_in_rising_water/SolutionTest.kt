package g0701_0800.s0778_swim_in_rising_water

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun swimInWater() {
        assertThat(Solution().swimInWater(arrayOf(intArrayOf(0, 2), intArrayOf(1, 3))), equalTo(3))
    }

    @Test
    fun swimInWater2() {
        assertThat(
            Solution()
                .swimInWater(
                    arrayOf(
                        intArrayOf(0, 1, 2, 3, 4),
                        intArrayOf(24, 23, 22, 21, 5),
                        intArrayOf(12, 13, 14, 15, 16),
                        intArrayOf(11, 17, 18, 19, 20),
                        intArrayOf(10, 9, 8, 7, 6)
                    )
                ),
            equalTo(16)
        )
    }
}
