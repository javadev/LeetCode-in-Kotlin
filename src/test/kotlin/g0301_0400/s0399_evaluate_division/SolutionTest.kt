package g0301_0400.s0399_evaluate_division

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun calcEquation() {
        val equations: List<List<String>> = ArrayUtils.getLists(arrayOf(arrayOf("a", "b"), arrayOf("b", "c")))
        val values = doubleArrayOf(2.0, 3.0)
        val queries: List<List<String>> = ArrayUtils.getLists(
            arrayOf(
                arrayOf("a", "c"),
                arrayOf("b", "a"),
                arrayOf("a", "e"),
                arrayOf("a", "a"),
                arrayOf("x", "x"),
            ),
        )
        val expected = doubleArrayOf(6.00000, 0.50000, -1.00000, 1.00000, -1.00000)
        assertThat(Solution().calcEquation(equations, values, queries), equalTo(expected))
    }

    @Test
    fun calcEquation2() {
        val equations: List<List<String>> =
            ArrayUtils.getLists(arrayOf(arrayOf("a", "b"), arrayOf("b", "c"), arrayOf("bc", "cd")))
        val values = doubleArrayOf(1.5, 2.5, 5.0)
        val queries: List<List<String>> =
            ArrayUtils.getLists(arrayOf(arrayOf("a", "c"), arrayOf("c", "b"), arrayOf("bc", "cd"), arrayOf("cd", "bc")))
        val expected = doubleArrayOf(3.75000, 0.40000, 5.00000, 0.20000)
        assertThat(Solution().calcEquation(equations, values, queries), equalTo(expected))
    }

    @Test
    fun calcEquation3() {
        val equations: List<List<String>> = ArrayList(listOf(listOf("a", "b")))
        val values = doubleArrayOf(0.5)
        val queries: List<List<String>> =
            ArrayUtils.getLists(arrayOf(arrayOf("a", "b"), arrayOf("b", "a"), arrayOf("a", "c"), arrayOf("x", "y")))
        val expected = doubleArrayOf(0.50000, 2.00000, -1.00000, -1.00000)
        assertThat(Solution().calcEquation(equations, values, queries), equalTo(expected))
    }
}
