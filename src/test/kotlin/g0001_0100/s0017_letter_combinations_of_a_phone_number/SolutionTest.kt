package g0001_0100.s0017_letter_combinations_of_a_phone_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun letterCombinations() {
        MatcherAssert.assertThat(
            Solution().letterCombinations("23"),
            CoreMatchers.equalTo(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        )
    }

    @Test
    fun letterCombinations2() {
        MatcherAssert.assertThat(Solution().letterCombinations(""), CoreMatchers.equalTo(listOf<Any>()))
    }

    @Test
    fun letterCombinations3() {
        MatcherAssert.assertThat(Solution().letterCombinations("2"), CoreMatchers.equalTo(listOf("a", "b", "c")))
    }

    @Test
    fun letterCombinations4() {
        MatcherAssert.assertThat(Solution().letterCombinations("4"), CoreMatchers.equalTo(listOf("g", "h", "i")))
    }

    @Test
    fun letterCombinations5() {
        MatcherAssert.assertThat(Solution().letterCombinations("5"), CoreMatchers.equalTo(listOf("j", "k", "l")))
    }

    @Test
    fun letterCombinations6() {
        MatcherAssert.assertThat(Solution().letterCombinations("6"), CoreMatchers.equalTo(listOf("m", "n", "o")))
    }

    @Test
    fun letterCombinations7() {
        MatcherAssert.assertThat(
            Solution().letterCombinations("7"), CoreMatchers.equalTo(listOf("p", "q", "r", "s"))
        )
    }

    @Test
    fun letterCombinations8() {
        MatcherAssert.assertThat(Solution().letterCombinations("8"), CoreMatchers.equalTo(listOf("t", "u", "v")))
    }

    @Test
    fun letterCombinations9() {
        MatcherAssert.assertThat(
            Solution().letterCombinations("9"), CoreMatchers.equalTo(listOf("w", "x", "y", "z"))
        )
    }
}
