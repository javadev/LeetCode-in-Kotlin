package g1401_1500.s1411_number_of_ways_to_paint_n_3_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfWays() {
        assertThat(Solution().numOfWays(1), equalTo(12))
    }

    @Test
    fun numOfWays2() {
        assertThat(Solution().numOfWays(5000), equalTo(30228214))
    }
}
