package g2201_2300.s2222_number_of_ways_to_select_buildings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWays() {
        assertThat(Solution().numberOfWays("001101"), equalTo(6L))
    }

    @Test
    fun numberOfWays2() {
        assertThat(Solution().numberOfWays("11100"), equalTo(0L))
    }
}
