package g3901_4000.s3970_shortest_path_with_at_most_k_consecutive_identical_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestPath() {
        assertThat<Int>(
            Solution()
                .shortestPath(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1), intArrayOf(0, 2, 3)),
                    "aab",
                    1,
                ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun shortestPath2() {
        assertThat<Int>(
            Solution()
                .shortestPath(
                    3,
                    arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1), intArrayOf(0, 2, 3)),
                    "aab",
                    2,
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun shortestPath3() {
        assertThat<Int>(
            Solution().shortestPath(3, arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1)), "aaa", 2),
            equalTo<Int>(-1),
        )
    }
}
