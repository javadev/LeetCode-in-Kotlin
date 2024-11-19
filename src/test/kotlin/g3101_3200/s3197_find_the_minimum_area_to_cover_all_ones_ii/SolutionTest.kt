package g3101_3200.s3197_find_the_minimum_area_to_cover_all_ones_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSum() {
        assertThat(
            Solution().minimumSum(arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))),
            equalTo(5),
        )
    }

    @Test
    fun minimumSum2() {
        assertThat(
            Solution().minimumSum(arrayOf(intArrayOf(1, 0, 1, 0), intArrayOf(0, 1, 0, 1))),
            equalTo(5),
        )
    }
}
