package g0101_0200.s0150_evaluate_reverse_polish_notation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun evalRPN() {
        assertThat(Solution().evalRPN(arrayOf("2", "1", "+", "3", "*")), equalTo(9))
    }

    @Test
    fun evalRPN2() {
        assertThat(Solution().evalRPN(arrayOf("4", "13", "5", "/", "+")), equalTo(6))
    }

    @Test
    fun evalRPN3() {
        assertThat(
            Solution()
                .evalRPN(
                    arrayOf(
                        "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5",
                        "+",
                    ),
                ),
            equalTo(22),
        )
    }
}
