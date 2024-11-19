package g3101_3200.s3195_find_the_minimum_area_to_cover_all_ones_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumArea() {
        assertThat(
            Solution().minimumArea(arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 0, 1))),
            equalTo(6),
        )
    }

    @Test
    fun minimumArea2() {
        assertThat(
            Solution().minimumArea(arrayOf(intArrayOf(1, 0), intArrayOf(0, 0))),
            equalTo(1),
        )
    }
}
