package g2001_2100.s2027_minimum_moves_to_convert_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumMoves() {
        assertThat(Solution().minimumMoves("XXX"), equalTo(1))
    }

    @Test
    fun minimumMoves2() {
        assertThat(Solution().minimumMoves("XXOX"), equalTo(2))
    }

    @Test
    fun minimumMoves3() {
        assertThat(Solution().minimumMoves("OOOO"), equalTo(0))
    }
}
