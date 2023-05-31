package g1101_1200.s1138_alphabet_board_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun alphabetBoardPath() {
        assertThat(Solution().alphabetBoardPath("leet"), equalTo("DDR!UURRR!!DDD!"))
    }

    @Test
    fun alphabetBoardPath2() {
        assertThat(Solution().alphabetBoardPath("code"), equalTo("RR!DDRR!LUU!R!"))
    }
}
