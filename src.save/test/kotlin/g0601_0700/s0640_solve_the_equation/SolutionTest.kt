package g0601_0700.s0640_solve_the_equation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solveEquation() {
        assertThat(Solution().solveEquation("x+5-3+x=6+x-2"), equalTo("x=2"))
    }

    @Test
    fun solveEquation2() {
        assertThat(Solution().solveEquation("x=x"), equalTo("Infinite solutions"))
    }

    @Test
    fun solveEquation3() {
        assertThat(Solution().solveEquation("2x=x"), equalTo("x=0"))
    }
}
