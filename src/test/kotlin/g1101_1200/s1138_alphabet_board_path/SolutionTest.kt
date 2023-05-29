package g1101_1200.s1138_alphabet_board_path

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun alphabetBoardPath() {
        MatcherAssert.assertThat(Solution().alphabetBoardPath("leet"), CoreMatchers.equalTo("DDR!UURRR!!DDD!"))
    }

    @Test
    fun alphabetBoardPath2() {
        MatcherAssert.assertThat(Solution().alphabetBoardPath("code"), CoreMatchers.equalTo("RR!DDRR!LUU!R!"))
    }
}