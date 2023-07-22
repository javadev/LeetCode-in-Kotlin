package g2201_2300.s2209_minimum_white_tiles_after_covering_with_carpets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumWhiteTiles() {
        assertThat(Solution().minimumWhiteTiles("10110101", 2, 2), equalTo(2))
    }

    @Test
    fun minimumWhiteTiles2() {
        assertThat(Solution().minimumWhiteTiles("11111", 2, 3), equalTo(0))
    }
}
