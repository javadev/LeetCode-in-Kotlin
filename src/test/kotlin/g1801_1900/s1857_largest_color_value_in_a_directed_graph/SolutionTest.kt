package g1801_1900.s1857_largest_color_value_in_a_directed_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestPathValue() {
        assertThat(
            Solution()
                .largestPathValue(
                    "abaca",
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(3, 4)),
                ),
            equalTo(3),
        )
    }

    @Test
    fun largestPathValue2() {
        assertThat(Solution().largestPathValue("a", arrayOf(intArrayOf(0, 0))), equalTo(-1))
    }
}
