package g0201_0300.s0241_different_ways_to_add_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun diffWaysToCompute() {
        assertThat(Solution().diffWaysToCompute("2-1-1"), equalTo(listOf(2, 0)))
    }

    @Test
    fun diffWaysToCompute2() {
        assertThat(
            Solution().diffWaysToCompute("2*3-4*5"),
            equalTo(listOf(-34, -10, -14, -10, 10)),
        )
    }
}
