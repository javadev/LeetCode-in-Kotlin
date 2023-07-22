package g0901_1000.s0957_prison_cells_after_n_days

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun prisonAfterNDays() {
        assertThat(
            Solution().prisonAfterNDays(intArrayOf(0, 1, 0, 1, 1, 0, 0, 1), 7),
            equalTo(intArrayOf(0, 0, 1, 1, 0, 0, 0, 0))
        )
    }

    @Test
    fun prisonAfterNDays2() {
        assertThat(
            Solution().prisonAfterNDays(intArrayOf(1, 0, 0, 1, 0, 0, 1, 0), 1000000000),
            equalTo(intArrayOf(0, 0, 1, 1, 1, 1, 1, 0))
        )
    }
}
