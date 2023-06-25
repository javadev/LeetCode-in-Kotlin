package g2101_2200.s2103_rings_and_rods

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPoints() {
        assertThat(Solution().countPoints("B0B6G0R6R0R6G9"), equalTo(1))
    }

    @Test
    fun countPoints2() {
        assertThat(Solution().countPoints("B0R0G0R9R0B0G0"), equalTo(1))
    }

    @Test
    fun countPoints3() {
        assertThat(Solution().countPoints("G4"), equalTo(0))
    }
}
