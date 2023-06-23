package g2101_2200.s2116_check_if_a_parentheses_string_can_be_valid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canBeValid() {
        assertThat(Solution().canBeValid("))()))", "010100"), equalTo(true))
    }

    @Test
    fun canBeValid2() {
        assertThat(Solution().canBeValid("()()", "0000"), equalTo(true))
    }

    @Test
    fun canBeValid3() {
        assertThat(Solution().canBeValid(")", "0"), equalTo(false))
    }

    @Test
    fun canBeValid4() {
        assertThat(Solution().canBeValid(null, "0"), equalTo(true))
    }

    @Test
    fun canBeValid5() {
        assertThat(Solution().canBeValid("", "0"), equalTo(true))
    }

    @Test
    fun canBeValid6() {
        assertThat(Solution().canBeValid("()()", null), equalTo(true))
    }

    @Test
    fun canBeValid7() {
        assertThat(Solution().canBeValid("()()", ""), equalTo(true))
    }

    @Test
    fun canBeValid8() {
        assertThat(
            Solution()
                .canBeValid(
                    "))))(())((()))))((()((((((())())((()))((((())()()))(()",
                    "101100101111110000000101000101001010110001110000000101"
                ),
            equalTo(false)
        )
    }

    @Test
    fun canBeValid9() {
        assertThat(
            Solution()
                .canBeValid(
                    "())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(",
                    "100011110110011011010111100111011101111110000101001101001111"
                ),
            equalTo(false)
        )
    }
}
