package g2301_2400.s2320_count_number_of_ways_to_place_houses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countHousePlacements() {
        assertThat(Solution().countHousePlacements(1), equalTo(4))
    }

    @Test
    fun countHousePlacements2() {
        assertThat(Solution().countHousePlacements(2), equalTo(9))
    }
}
