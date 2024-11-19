package g1201_1300.s1237_find_positive_integer_solution_for_a_given_equation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSolution() {
        val customFunction: Solution.CustomFunction = object : Solution.CustomFunction {
            var index = 0
            override fun f(x: Int, y: Int): Int {
                return index++
            }
        }
        assertThat(
            Solution().findSolution(customFunction, 1),
            equalTo(listOf(mutableListOf(2, 1000))),
        )
    }
}
