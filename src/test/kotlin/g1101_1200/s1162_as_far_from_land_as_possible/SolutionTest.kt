package g1101_1200.s1162_as_far_from_land_as_possible

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistance() {
        assertThat(
            Solution().maxDistance(arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 1))),
            equalTo(2)
        )
    }

    @Test
    fun maxDistance2() {
        assertThat(
            Solution().maxDistance(arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))),
            equalTo(4)
        )
    }
}
