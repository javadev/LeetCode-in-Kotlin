package g1001_1100.s1001_grid_illumination

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gridIllumination() {
        assertThat(
            Solution()
                .gridIllumination(
                    5, arrayOf(intArrayOf(0, 0), intArrayOf(4, 4)), arrayOf(intArrayOf(1, 1), intArrayOf(1, 0))
                ),
            equalTo(intArrayOf(1, 0))
        )
    }

    @Test
    fun gridIllumination2() {
        assertThat(
            Solution()
                .gridIllumination(
                    5, arrayOf(intArrayOf(0, 0), intArrayOf(4, 4)), arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))
                ),
            equalTo(intArrayOf(1, 1))
        )
    }

    @Test
    fun gridIllumination3() {
        assertThat(
            Solution()
                .gridIllumination(
                    5,
                    arrayOf(intArrayOf(0, 0), intArrayOf(0, 4)),
                    arrayOf(intArrayOf(0, 4), intArrayOf(0, 1), intArrayOf(1, 4))
                ),
            equalTo(intArrayOf(1, 1, 0))
        )
    }
}
