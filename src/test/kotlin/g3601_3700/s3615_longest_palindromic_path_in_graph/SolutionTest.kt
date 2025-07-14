package g3601_3700.s3615_longest_palindromic_path_in_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxLen() {
        assertThat<Int>(
            Solution().maxLen(
                3,
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2)),
                "aba",
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxLen2() {
        assertThat<Int>(
            Solution().maxLen(
                3,
                arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 2)),
                "abc",
            ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun maxLen3() {
        assertThat<Int>(
            Solution().maxLen(4, arrayOf<IntArray>(intArrayOf(0, 2), intArrayOf(0, 3), intArrayOf(3, 1)), "bbac"),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxLen4() {
        assertThat(Solution().maxLen(3, arrayOf<IntArray>(intArrayOf(2, 0), intArrayOf(2, 1)), "mll"), equalTo(2))
    }
}
