package g0001_0100.s0017_letter_combinations_of_a_phone_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun letterCombinations() {
        assertThat(
            Solution().letterCombinations("23"),
            equalTo(listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        )
    }

    @Test
    fun letterCombinations2() {
        assertThat(Solution().letterCombinations(""), equalTo(listOf<Any>()))
    }

    @Test
    fun letterCombinations3() {
        assertThat(Solution().letterCombinations("2"), equalTo(listOf("a", "b", "c")))
    }

    @Test
    fun letterCombinations4() {
        assertThat(Solution().letterCombinations("4"), equalTo(listOf("g", "h", "i")))
    }

    @Test
    fun letterCombinations5() {
        assertThat(Solution().letterCombinations("5"), equalTo(listOf("j", "k", "l")))
    }

    @Test
    fun letterCombinations6() {
        assertThat(Solution().letterCombinations("6"), equalTo(listOf("m", "n", "o")))
    }

    @Test
    fun letterCombinations7() {
        assertThat(
            Solution().letterCombinations("7"), equalTo(listOf("p", "q", "r", "s"))
        )
    }

    @Test
    fun letterCombinations8() {
        assertThat(Solution().letterCombinations("8"), equalTo(listOf("t", "u", "v")))
    }

    @Test
    fun letterCombinations9() {
        assertThat(
            Solution().letterCombinations("9"), equalTo(listOf("w", "x", "y", "z"))
        )
    }
}
