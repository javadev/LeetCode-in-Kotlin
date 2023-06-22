package g2001_2100.s2027_minimum_moves_to_convert_string

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumMoves() {
        MatcherAssert.assertThat(Solution().minimumMoves("XXX"), CoreMatchers.equalTo(1))
    }

    @Test
    fun minimumMoves2() {
        MatcherAssert.assertThat(Solution().minimumMoves("XXOX"), CoreMatchers.equalTo(2))
    }

    @Test
    fun minimumMoves3() {
        MatcherAssert.assertThat(Solution().minimumMoves("OOOO"), CoreMatchers.equalTo(0))
    }
}
