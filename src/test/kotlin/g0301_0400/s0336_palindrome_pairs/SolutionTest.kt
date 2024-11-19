package g0301_0400.s0336_palindrome_pairs

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun palindromePairs() {
        assertThat(
            Solution().palindromePairs(arrayOf("abcd", "dcba", "lls", "s", "sssll")),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 0),
                        intArrayOf(2, 4),
                        intArrayOf(3, 2),
                    ),
                ),
            ),
        )
    }

    @Test
    fun palindromePairs2() {
        assertThat(
            Solution().palindromePairs(arrayOf("bat", "tab", "cat")),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 0),
                    ),
                ),
            ),
        )
    }

    @Test
    fun palindromePairs3() {
        assertThat(
            Solution().palindromePairs(arrayOf("a", "")),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 0),
                    ),
                ),
            ),
        )
    }
}
