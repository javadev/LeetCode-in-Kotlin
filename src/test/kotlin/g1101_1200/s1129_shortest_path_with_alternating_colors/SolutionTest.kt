package g1101_1200.s1129_shortest_path_with_alternating_colors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestAlternatingPaths() {
        assertThat(
            Solution()
                .shortestAlternatingPaths(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2)), arrayOf()),
            equalTo(intArrayOf(0, 1, -1))
        )
    }

    @Test
    fun shortestAlternatingPaths2() {
        assertThat(
            Solution()
                .shortestAlternatingPaths(3, arrayOf(intArrayOf(0, 1)), arrayOf(intArrayOf(2, 1))),
            equalTo(intArrayOf(0, 1, -1))
        )
    }
}
