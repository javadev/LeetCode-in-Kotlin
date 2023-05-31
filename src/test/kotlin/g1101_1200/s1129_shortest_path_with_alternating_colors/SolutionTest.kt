package g1101_1200.s1129_shortest_path_with_alternating_colors

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestAlternatingPaths() {
        MatcherAssert.assertThat(
            Solution()
                .shortestAlternatingPaths(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2)), arrayOf()),
            CoreMatchers.equalTo(intArrayOf(0, 1, -1))
        )
    }

    @Test
    fun shortestAlternatingPaths2() {
        MatcherAssert.assertThat(
            Solution()
                .shortestAlternatingPaths(3, arrayOf(intArrayOf(0, 1)), arrayOf(intArrayOf(2, 1))),
            CoreMatchers.equalTo(intArrayOf(0, 1, -1))
        )
    }
}
