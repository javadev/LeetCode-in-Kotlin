package g3701_3800.s3740_minimum_distance_between_three_equal_elements_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDistance() {
        assertThat<Int>(Solution().minimumDistance(intArrayOf(1, 1, 1)), equalTo<Int>(4))
    }

    @Test
    fun minimumDistance2() {
        assertThat<Int>(
            Solution().minimumDistance(intArrayOf(1, 2, 3, 1, 2, 3)),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minimumDistance3() {
        assertThat<Int>(
            Solution().minimumDistance(intArrayOf(1, 2, 1, 2, 1)),
            equalTo<Int>(8),
        )
    }
}
