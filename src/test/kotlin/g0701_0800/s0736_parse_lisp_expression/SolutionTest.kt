package g0701_0800.s0736_parse_lisp_expression

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun evaluate() {
        assertThat(
            Solution().evaluate("(let x 2 (mult x (let x 3 y 4 (add x y))))"), equalTo(14)
        )
    }

    @Test
    fun evaluate2() {
        assertThat(Solution().evaluate("(let x 3 x 2 x)"), equalTo(2))
    }

    @Test
    fun evaluate3() {
        assertThat(Solution().evaluate("(let x 1 y 2 x (add x y) (add x y))"), equalTo(5))
    }
}
