package g2501_2600.s2579_count_total_number_of_colored_cells

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun coloredCells() {
        assertThat(Solution().coloredCells(1), equalTo(1L))
    }

    @Test
    fun coloredCells2() {
        assertThat(Solution().coloredCells(2), equalTo(5L))
    }
}
