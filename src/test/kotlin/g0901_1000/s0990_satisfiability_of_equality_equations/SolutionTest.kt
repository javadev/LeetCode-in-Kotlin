package g0901_1000.s0990_satisfiability_of_equality_equations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun equationsPossible() {
        assertThat(Solution().equationsPossible(arrayOf("a==b", "b!=a")), equalTo(false))
    }

    @Test
    fun equationsPossible2() {
        assertThat(Solution().equationsPossible(arrayOf("b==a", "a==b")), equalTo(true))
    }
}
