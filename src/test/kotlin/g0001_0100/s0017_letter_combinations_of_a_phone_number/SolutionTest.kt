package g0001_0100.s0017_letter_combinations_of_a_phone_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun letterCombinations() {
        MatcherAssert.assertThat(
            Solution().letterCombinations("23"),
            CoreMatchers.equalTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
        )
    }

    @Test
    fun letterCombinations2() {
        MatcherAssert.assertThat(Solution().letterCombinations(""), CoreMatchers.equalTo(Arrays.asList<Any>()))
    }

    @Test
    fun letterCombinations3() {
        MatcherAssert.assertThat(Solution().letterCombinations("2"), CoreMatchers.equalTo(Arrays.asList("a", "b", "c")))
    }

    @Test
    fun letterCombinations4() {
        MatcherAssert.assertThat(Solution().letterCombinations("4"), CoreMatchers.equalTo(Arrays.asList("g", "h", "i")))
    }

    @Test
    fun letterCombinations5() {
        MatcherAssert.assertThat(Solution().letterCombinations("5"), CoreMatchers.equalTo(Arrays.asList("j", "k", "l")))
    }

    @Test
    fun letterCombinations6() {
        MatcherAssert.assertThat(Solution().letterCombinations("6"), CoreMatchers.equalTo(Arrays.asList("m", "n", "o")))
    }

    @Test
    fun letterCombinations7() {
        MatcherAssert.assertThat(
            Solution().letterCombinations("7"), CoreMatchers.equalTo(Arrays.asList("p", "q", "r", "s"))
        )
    }

    @Test
    fun letterCombinations8() {
        MatcherAssert.assertThat(Solution().letterCombinations("8"), CoreMatchers.equalTo(Arrays.asList("t", "u", "v")))
    }

    @Test
    fun letterCombinations9() {
        MatcherAssert.assertThat(
            Solution().letterCombinations("9"), CoreMatchers.equalTo(Arrays.asList("w", "x", "y", "z"))
        )
    }
}
