package g0601_0700.s0605_can_place_flowers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canPlaceFlowers() {
        assertThat(Solution().canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1), equalTo(true))
    }

    @Test
    fun canPlaceFlowers2() {
        assertThat(Solution().canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2), equalTo(false))
    }
}
