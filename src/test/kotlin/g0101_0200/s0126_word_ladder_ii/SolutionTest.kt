package g0101_0200.s0126_word_ladder_ii

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLadders() {
        assertThat(
            Solution()
                .findLadders(
                    "hit",
                    "cog",
                    listOf("hot", "dot", "dog", "lot", "log", "cog"),
                ),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        arrayOf("hit", "hot", "lot", "log", "cog"),
                        arrayOf("hit", "hot", "dot", "dog", "cog"),
                    ),
                ),
            ),
        )
    }

    @Test
    fun findLadders2() {
        assertThat(
            Solution()
                .findLadders(
                    "hit",
                    "cog",
                    listOf("hot", "dot", "dog", "lot", "log"),
                ),
            equalTo(ArrayUtils.getLists(arrayOf<Array<String>>())),
        )
    }
}
