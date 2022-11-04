package g0201_0300.s0282_expression_add_operators

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun addOperators() {
        assertThat(Solution().addOperators("123", 6), equalTo(Arrays.asList("1+2+3", "1*2*3")))
    }

    @Test
    fun addOperators2() {
        assertThat(Solution().addOperators("232", 8), equalTo(Arrays.asList("2+3*2", "2*3+2")))
    }

    @Test
    fun addOperators3() {
        assertThat(
            Solution().addOperators("3456237490", 9191), equalTo(emptyList())
        )
    }
}
