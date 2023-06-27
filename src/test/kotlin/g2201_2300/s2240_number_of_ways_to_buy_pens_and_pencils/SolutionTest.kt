package g2201_2300.s2240_number_of_ways_to_buy_pens_and_pencils

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToBuyPensPencils() {
        assertThat(Solution().waysToBuyPensPencils(20, 10, 5), equalTo(9L))
    }

    @Test
    fun waysToBuyPensPencils2() {
        assertThat(Solution().waysToBuyPensPencils(5, 10, 10), equalTo(1L))
    }
}
