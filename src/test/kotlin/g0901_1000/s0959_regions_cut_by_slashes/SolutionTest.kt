package g0901_1000.s0959_regions_cut_by_slashes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun regionsBySlashes() {
        assertThat(Solution().regionsBySlashes(arrayOf(" /", "/ ")), equalTo(2))
    }

    @Test
    fun regionsBySlashes2() {
        assertThat(Solution().regionsBySlashes(arrayOf(" /", "  ")), equalTo(1))
    }

    @Test
    fun regionsBySlashes3() {
        assertThat(Solution().regionsBySlashes(arrayOf("/\\", "\\/")), equalTo(5))
    }
}
