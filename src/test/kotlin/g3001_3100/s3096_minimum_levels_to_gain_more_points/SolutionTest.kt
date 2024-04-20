package g3001_3100.s3096_minimum_levels_to_gain_more_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumLevels() {
        assertThat(Solution().minimumLevels(intArrayOf(1, 0, 1, 0)), equalTo(1))
    }

    @Test
    fun minimumLevels2() {
        assertThat(Solution().minimumLevels(intArrayOf(1, 1, 1, 1, 1)), equalTo(3))
    }

    @Test
    fun minimumLevels3() {
        assertThat(Solution().minimumLevels(intArrayOf(0, 0)), equalTo(-1))
    }
}
