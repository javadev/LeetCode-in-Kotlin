package g2501_2600.s2558_take_gifts_from_the_richest_pile

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pickGifts() {
        assertThat(
            Solution().pickGifts(intArrayOf(25, 64, 9, 4, 100), 4),
            equalTo(29)
        )
    }

    @Test
    fun pickGifts2() {
        assertThat(
            Solution().pickGifts(intArrayOf(1, 1, 1, 1), 4),
            equalTo(4)
        )
    }
}
