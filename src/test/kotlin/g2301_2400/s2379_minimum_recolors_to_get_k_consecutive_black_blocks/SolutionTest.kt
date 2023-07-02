package g2301_2400.s2379_minimum_recolors_to_get_k_consecutive_black_blocks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumRecolors() {
        assertThat(Solution().minimumRecolors("WBBWWBBWBW", 7), equalTo(3))
    }

    @Test
    fun minimumRecolors2() {
        assertThat(Solution().minimumRecolors("WBWBBBW", 2), equalTo(0))
    }
}
