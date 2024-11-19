package g1701_1800.s1765_map_of_highest_peak

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun highestPeak() {
        assertThat(
            Solution().highestPeak(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0))),
            equalTo(arrayOf(intArrayOf(1, 0), intArrayOf(2, 1))),
        )
    }

    @Test
    fun highestPeak2() {
        assertThat(
            Solution().highestPeak(arrayOf(intArrayOf(0, 0, 1), intArrayOf(1, 0, 0), intArrayOf(0, 0, 0))),
            equalTo(arrayOf(intArrayOf(1, 1, 0), intArrayOf(0, 1, 1), intArrayOf(1, 2, 2))),
        )
    }
}
