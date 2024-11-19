package g2101_2200.s2125_number_of_laser_beams_in_a_bank

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfBeams() {
        assertThat(
            Solution().numberOfBeams(arrayOf("011001", "000000", "010100", "001000")),
            equalTo(8),
        )
    }

    @Test
    fun numberOfBeams2() {
        assertThat(Solution().numberOfBeams(arrayOf("000", "111", "000")), equalTo(0))
    }
}
